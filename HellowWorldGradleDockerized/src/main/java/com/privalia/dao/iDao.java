package com.privalia.dao;

import java.io.IOException;

public interface iDao<T> {
	T add(T model) throws IOException;
}
