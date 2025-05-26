package qh2;

import i91.e0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    public final g f103927a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HttpURLConnection httpURLConnection, boolean z13) {
        super(httpURLConnection.getURL());
        g gVar = new g(httpURLConnection, z13);
        this.f103927a = gVar;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f103927a.f103930a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f103927a.b();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        g gVar = this.f103927a;
        Long valueOf = Long.valueOf(gVar.f103931b);
        if (gVar.f103936g == null) {
            gVar.f103936g = valueOf;
        }
        gVar.l();
        gVar.f103930a.disconnect();
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f103927a.f103930a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f103927a.f103930a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        g gVar = this.f103927a;
        gVar.k();
        return gVar.f103930a.getContent();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        g gVar = this.f103927a;
        if (gVar.o()) {
            return null;
        }
        return gVar.f103930a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        g gVar = this.f103927a;
        if (gVar.o()) {
            return -1;
        }
        return gVar.f103930a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        g gVar = this.f103927a;
        if (gVar.o()) {
            return -1L;
        }
        return gVar.f103930a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        return this.f103927a.f103930a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        return this.f103927a.f103930a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f103927a.f103930a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f103927a.f103930a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f103927a.f103930a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        g gVar = this.f103927a;
        return gVar.i(gVar.f103930a.getErrorStream());
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i13) {
        return this.f103927a.c(i13);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j13) {
        return this.f103927a.d(str, j13);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i13) {
        return this.f103927a.e(str, i13);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i13) {
        g gVar = this.f103927a;
        String headerFieldKey = gVar.f103930a.getHeaderFieldKey(i13);
        return (String) gVar.m(headerFieldKey, new lr.d(headerFieldKey, 3));
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j13) {
        return this.f103927a.f(str, j13);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        g gVar = this.f103927a;
        gVar.a(null);
        return (Map) gVar.f103943n.get();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f103927a.f103930a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        g gVar = this.f103927a;
        gVar.getClass();
        try {
            return gVar.i(gVar.f103930a.getInputStream());
        } catch (IOException e13) {
            gVar.f103939j = e13;
            throw e13;
        }
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f103927a.f103930a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        return this.f103927a.f103930a.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f103927a.g();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.f103927a.f103930a.getPermission();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f103927a.f103930a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f103927a.f103930a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f103927a.f103930a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f103927a.f103930a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        g gVar = this.f103927a;
        gVar.k();
        gVar.a(null);
        return gVar.f103942m.get();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        g gVar = this.f103927a;
        gVar.k();
        gVar.a(null);
        return gVar.f103930a.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f103927a.f103930a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f103927a.f103930a.getUseCaches();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z13) {
        this.f103927a.f103930a.setAllowUserInteraction(z13);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i13) {
        this.f103927a.f103930a.setChunkedStreamingMode(i13);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i13) {
        this.f103927a.f103930a.setConnectTimeout(i13);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z13) {
        this.f103927a.f103930a.setDefaultUseCaches(z13);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z13) {
        this.f103927a.f103930a.setDoInput(z13);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z13) {
        this.f103927a.f103930a.setDoOutput(z13);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i13) {
        this.f103927a.f103930a.setFixedLengthStreamingMode(i13);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j13) {
        this.f103927a.f103930a.setIfModifiedSince(j13);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z13) {
        this.f103927a.f103930a.setInstanceFollowRedirects(z13);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i13) {
        this.f103927a.f103930a.setReadTimeout(i13);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.f103927a.f103930a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        g gVar = this.f103927a;
        gVar.f103930a.setRequestProperty(str, str2);
        if (gVar.j()) {
            gVar.f103938i = g.h(gVar.f103930a.getRequestProperties());
        }
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z13) {
        this.f103927a.f103930a.setUseCaches(z13);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f103927a.f103930a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f103927a.f103930a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        g gVar = this.f103927a;
        gVar.getClass();
        return (String) gVar.m(str, new e0(str, 1, gVar));
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        g gVar = this.f103927a;
        gVar.k();
        return gVar.f103930a.getContent(clsArr);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j13) {
        this.f103927a.f103930a.setFixedLengthStreamingMode(j13);
    }
}
