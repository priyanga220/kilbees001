package com.kilbees.application.utils;

import com.kilbees.core.app.exception.KilBeesProviderException;

public class KilbeesSharedDaemon 
{

	private String getPrefix(String parameter)
	{
		return "ss";
	}
	

	public static String obtainPrimaryKey(KilbeesConstantsFactory.KeyType keyType) throws KilBeesProviderException
	{
		String result = null;

		
		switch(keyType)
		{
			case ACCOUNT:
			{
				result = "pp";
				break;
			}
			default:
			{
				
			}
		}
		
		if(result == null)
		{
			throw new KilBeesProviderException("Primary Key Definition Error");
		}
		else
		{
			return result;
		}

	}
}
