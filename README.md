# Percolation Lab

In this lab, we examine one way of using the computer to simulate a problem
which can be solved only _probabilistically_, but not proved directly with
theoretical mathematics.

## Introduction

**Percolation Theory** is a field of mathematics related to network theory.
The problem of percolation is relatively simple. Give some material, is
there an open path within it through which water (or some other fluid) would
be able to flow.

There are many ways of considering this problem: in two vs. three dimmensions,
using square shapes vs. arbitrary shapes, etc. For our purposes, we will
consider an n-by-n square lattice or grid which contains individual sites,
which can be either open or closed. If a site is open, water can flow into
it. If it is closed, it cannot.

Now, water can flow from one site to another if and only if:

    1. The two sites share a common border and
    2. Both sites are open
    
Finally, we assume that water flows from _above_ the latice and can make its
way through open sites on the top row. We say that the system _percolates_ if
and only if water can flow in a complete path from somewhere in the top row to
an open site in the bottom row.

### Problem

Given a certain number of sites open in a lattice, there is a certain
probability _p_ that the system will percolate. The larger the system is, the
narrower that _p_ becomes. In other words, for large enough n-by-n systems, the
system will virtually always percolate when a certain fraction of open sites is
reached and virtually never percolate when that threshold fraction is not
reached.

This threshold can be determined by simmulation but it is not well understood
mathematically. That is, we can arrive at the solution computationally and
calculate the threshold with incredible precision, but we cannot prove it
to be correct _theoretically_. Thus, this problem showcases the strength of
computer programming as an empirical discipline which can make observations
quickly and cheaply.

## Assignment




