package com.pinterest.xrenderer;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/pinterest/xrenderer/RustBridge$Surface", "", "", "handle", "", "width", "height", "", "resize", "(JII)V", "release", "(J)V", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RustBridge$Surface {

    /* renamed from: a, reason: collision with root package name */
    public static final RustBridge$Surface f52864a = new RustBridge$Surface();

    static {
        int i13 = RustBridge$Library.f52860a;
    }

    public final native void release(long handle);

    public final native void resize(long handle, int width, int height);
}
