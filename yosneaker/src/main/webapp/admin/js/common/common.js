var common={
		getTime:function(value,row,index){  
			if(value != null)
				return new Date(value).toLocaleString();  
			else
				return "";
        }
}