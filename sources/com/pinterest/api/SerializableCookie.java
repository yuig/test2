package com.pinterest.api;

import androidx.annotation.Keep;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.HttpCookie;

@Keep
/* loaded from: classes.dex */
public class SerializableCookie implements Serializable {
    private static final long serialVersionUID = 6374381828722046732L;
    private transient HttpCookie _cookie;

    public SerializableCookie(HttpCookie httpCookie) {
        this._cookie = httpCookie;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        HttpCookie httpCookie = new HttpCookie((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this._cookie = httpCookie;
        httpCookie.setComment((String) objectInputStream.readObject());
        this._cookie.setDomain((String) objectInputStream.readObject());
        this._cookie.setMaxAge(((Long) objectInputStream.readObject()).longValue());
        this._cookie.setPath((String) objectInputStream.readObject());
        this._cookie.setVersion(objectInputStream.readInt());
        this._cookie.setSecure(objectInputStream.readBoolean());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this._cookie.getName());
        objectOutputStream.writeObject(this._cookie.getValue());
        objectOutputStream.writeObject(this._cookie.getComment());
        objectOutputStream.writeObject(this._cookie.getDomain());
        objectOutputStream.writeObject(Long.valueOf(this._cookie.getMaxAge()));
        objectOutputStream.writeObject(this._cookie.getPath());
        objectOutputStream.writeInt(this._cookie.getVersion());
        objectOutputStream.writeBoolean(this._cookie.getSecure());
    }

    public HttpCookie getCookie() {
        return this._cookie;
    }
}
