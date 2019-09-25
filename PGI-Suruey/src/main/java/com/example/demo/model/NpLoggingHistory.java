package com.example.demo.model;


import java.util.Date;

/**
 * NpLogHistory generated by hbm2java
 */
public class NpLoggingHistory
    implements java.io.Serializable
{
    private long   logHistoryId;
    private String userId;
    private Date   loginTime;
    private String clientIp;
    private Date   logoutTime;
    private String accessType;
    private String sessionId;

    public NpLoggingHistory()
    {
    }

    public NpLoggingHistory( long logHistoryId, String userId, Date loginTime )
    {
        this.logHistoryId = logHistoryId;
        this.userId = userId;
        this.loginTime = loginTime;
    }

    public NpLoggingHistory( long logHistoryId,
                             String userId,
                             Date loginTime,
                             String clientIp,
                             Date logoutTime,
                             String accessType,
                             String sessionId )
    {
        this.logHistoryId = logHistoryId;
        this.userId = userId;
        this.loginTime = loginTime;
        this.clientIp = clientIp;
        this.logoutTime = logoutTime;
        this.accessType = accessType;
        this.sessionId = sessionId;
    }

    public long getLogHistoryId()
    {
        return this.logHistoryId;
    }

    public void setLogHistoryId( long logHistoryId )
    {
        this.logHistoryId = logHistoryId;
    }

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId( String userId )
    {
        this.userId = userId;
    }

    public Date getLoginTime()
    {
        return this.loginTime;
    }

    public void setLoginTime( Date loginTime )
    {
        this.loginTime = loginTime;
    }

    public String getClientIp()
    {
        return this.clientIp;
    }

    public void setClientIp( String clientIp )
    {
        this.clientIp = clientIp;
    }

    public Date getLogoutTime()
    {
        return this.logoutTime;
    }

    public void setLogoutTime( Date logoutTime )
    {
        this.logoutTime = logoutTime;
    }

    public String getAccessType()
    {
        return this.accessType;
    }

    public void setAccessType( String accessType )
    {
        this.accessType = accessType;
    }

    public String getSessionId()
    {
        return this.sessionId;
    }

    public void setSessionId( String sessionId )
    {
        this.sessionId = sessionId;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append( "NpLoggingHistory [logHistoryId=" );
        builder.append( logHistoryId );
        builder.append( ", userId=" );
        builder.append( userId );
        builder.append( ", loginTime=" );
        builder.append( loginTime );
        builder.append( ", clientIp=" );
        builder.append( clientIp );
        builder.append( ", logoutTime=" );
        builder.append( logoutTime );
        builder.append( ", accessType=" );
        builder.append( accessType );
        builder.append( ", sessionId=" );
        builder.append( sessionId );
        builder.append( "]" );
        return builder.toString();
    }
    
    
}
