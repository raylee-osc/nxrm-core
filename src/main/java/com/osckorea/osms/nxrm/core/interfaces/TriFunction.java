package com.osckorea.osms.nxrm.core.interfaces;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}