package com.bugsnag.android.repackaged.dslplatform.json;

import java.io.IOException;

/* loaded from: classes3.dex */
public class ParsingException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29478a = 0;

    public static ParsingException a(String str, boolean z13) {
        return z13 ? new ParsingException(str) : new x(str);
    }
}
