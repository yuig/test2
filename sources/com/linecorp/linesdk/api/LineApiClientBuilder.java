package com.linecorp.linesdk.api;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.ManifestParser;
import db.d;
import gi.m;
import java.lang.reflect.Proxy;
import java.util.concurrent.Executors;
import sn.a;
import sn.b;
import wn.c;
import xn.e;
import xn.g;

/* loaded from: classes3.dex */
public class LineApiClientBuilder {

    @NonNull
    private Uri apiBaseUri;

    @NonNull
    private final String channelId;

    @NonNull
    private final Context context;
    private boolean isEncryptorPreparationDisabled;
    private boolean isTokenAutoRefreshDisabled;

    @NonNull
    private Uri openidDiscoveryDocumentUrl;

    public LineApiClientBuilder(@NonNull Context context, @NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("channel id is empty");
        }
        this.context = context.getApplicationContext();
        this.channelId = str;
        LineEnvConfig parse = new ManifestParser().parse(context);
        parse = parse == null ? new b() : parse;
        this.openidDiscoveryDocumentUrl = Uri.parse(parse.getOpenIdDiscoveryDocumentUrl());
        this.apiBaseUri = Uri.parse(parse.getApiServerBaseUri());
    }

    @NonNull
    @Deprecated
    public LineApiClientBuilder apiBaseUri(Uri uri) {
        if (uri != null) {
            this.apiBaseUri = uri;
        }
        return this;
    }

    @NonNull
    public a build() {
        if (!this.isEncryptorPreparationDisabled) {
            Context context = this.context;
            if (!c.f130434b) {
                c.f130434b = true;
                Executors.newSingleThreadExecutor().execute(new wn.b(context.getApplicationContext(), 0));
            }
        }
        tn.b bVar = new tn.b(this.channelId, new e(this.context, this.openidDiscoveryDocumentUrl, this.apiBaseUri), new g(this.context, this.apiBaseUri), new m(23, this.context, this.channelId));
        return this.isTokenAutoRefreshDisabled ? bVar : (a) Proxy.newProxyInstance(tn.b.class.getClassLoader(), new Class[]{a.class}, new d(bVar));
    }

    @NonNull
    public LineApiClientBuilder disableEncryptorPreparation() {
        this.isEncryptorPreparationDisabled = true;
        return this;
    }

    @NonNull
    public LineApiClientBuilder disableTokenAutoRefresh() {
        this.isTokenAutoRefreshDisabled = true;
        return this;
    }

    @NonNull
    @Deprecated
    public LineApiClientBuilder openidDiscoveryDocumentUrl(Uri uri) {
        if (uri != null) {
            this.openidDiscoveryDocumentUrl = uri;
        }
        return this;
    }
}
