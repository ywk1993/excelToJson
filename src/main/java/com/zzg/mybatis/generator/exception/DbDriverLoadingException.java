package com.zzg.mybatis.generator.exception;

/**
 * 数据库驱动加载异常
 * @Date 2017/8/15 21:46
 * @Author jy
 */
public class DbDriverLoadingException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DbDriverLoadingException(String message){
        super(message);
    }
}
