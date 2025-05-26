package org.eclipse.paho.client.mqttv3;

import java.util.MissingResourceException;
import np2.a;

/* loaded from: classes4.dex */
public class MqttException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f97473a;

    public MqttException(int i13) {
        this.f97473a = i13;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        boolean z13;
        int i13 = this.f97473a;
        if (a.f91803b == null) {
            try {
                Class.forName("java.util.ResourceBundle");
                z13 = true;
            } catch (ClassNotFoundException unused) {
                z13 = false;
            }
            try {
                if (z13) {
                    a.f91803b = (a) a.class.newInstance();
                } else {
                    try {
                        Class.forName("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog");
                        a.f91803b = (a) Class.forName("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog").newInstance();
                    } catch (ClassNotFoundException unused2) {
                    }
                }
            } catch (Exception unused3) {
                return "";
            }
        }
        a aVar = a.f91803b;
        aVar.getClass();
        try {
            str = aVar.f91804a.getString(Integer.toString(i13));
        } catch (MissingResourceException unused4) {
            str = "MqttException";
        }
        return str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb3 = new StringBuilder(String.valueOf(getMessage()));
        sb3.append(" (");
        return a.a.n(sb3, this.f97473a, ")");
    }
}
