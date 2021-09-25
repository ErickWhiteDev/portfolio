import scipy.integrate as integrate
import numpy as np

def f(x):
    return(1 / (np.sqrt(x))) # Equation goes here, temporarily hard-coded as an example but will be based on input in the future

def calc_error(true_value, measured_value):
    return (abs(measured_value - true_value) / true_value) * 100

def calc_integral(function, lower_bound, upper_bound, step_count, decimal_places):
    percent = "%" # Required for Python string formatting
    steps = np.linspace(lower_bound, upper_bound, step_count + 1) # Splits domain into evenly-spaced slices
    dx = (upper_bound - lower_bound) / step_count # Determines width of slices for integration

    mram = []
    for i in range(len(steps) - 1): # Creates a domain of MRAM-compatible points based on base steps
        mram.append((steps[i] + steps[i + 1]) / 2)

    integral = integrate.quad(function, lower_bound, upper_bound)[0]
    integral_trapezoidal = integrate.trapezoid([function(x) for x in steps], dx = dx)
    integral_simpsons = integrate.simpson([function(x) for x in steps], dx = dx)
    integral_lram = np.sum([function(x) * dx for x in steps[:step_count]])
    integral_rram = np.sum([function(x) * dx for x in steps[1:]])
    integral_mram = np.sum([function(x) * dx for x in mram])

    print("Integral of f(x): {0:.{d}f}".format(integral, d=decimal_places))
    print("Integral of f(x) using trapezoidal rule: {0:.{d}f} with {1:.{d}f}{2} error".format(integral_trapezoidal, calc_error(integral, integral_trapezoidal), percent, d=decimal_places))
    print("Integral of f(x) using Simpson's rule: {0:.{d}f} with {1:.{d}f}{2} error".format(integral_simpsons, calc_error(integral, integral_simpsons), percent, d=decimal_places))
    print("Integral of f(x) using LRAM: {0:.{d}f} with {1:.{d}f}{2} error".format(integral_lram, calc_error(integral, integral_lram), percent, d=decimal_places))
    print("Integral of f(x) using RRAM: {0:.{d}f} with {1:.{d}f}{2} error".format(integral_rram, calc_error(integral, integral_rram), percent, d=decimal_places))
    print("Integral of f(x) using MRAM: {0:.{d}f} with {1:.{d}f}{2} error".format(integral_mram, calc_error(integral, integral_mram), percent, d=decimal_places))

lower_bound = int(input("Lower bound: "))
upper_bound = int(input("Upper bound: "))
steps = int(input("Steps: "))
decimal_places = int(input("Decimal places: "))

calc_integral(f, lower_bound, upper_bound, steps, decimal_places)