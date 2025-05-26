package com.pinterest.xrenderer;

import ed2.c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/pinterest/xrenderer/RustBridge$Library", "", "", "logLevelFilter", "", "realtimeProfiling", "", "init", "(IZ)V", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RustBridge$Library {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f52860a = 0;

    static {
        RustBridge$Library rustBridge$Library = new RustBridge$Library();
        System.loadLibrary("xrenderer");
        rustBridge$Library.init(c.f58755a.getValue(), false);
    }

    private final native void init(int logLevelFilter, boolean realtimeProfiling);
}
