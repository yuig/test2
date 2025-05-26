package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzji extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31732a = 0;

    public static zzji a() {
        return new zzji("Protocol message had invalid UTF-8.");
    }

    public static zzji b() {
        return new zzji("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzji c() {
        return new zzji("Failed to parse the message.");
    }

    public static zzji d() {
        return new zzji("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
