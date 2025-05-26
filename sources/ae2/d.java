package ae2;

import android.util.Size;
import j1.v0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f15059f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Size f15060e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Size size, b elemType) {
        this(size);
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(elemType, "elemType");
        v0 block = new v0(this, elemType, size, null, 20);
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke();
    }

    public d(Size size) {
        super(c.Texture2D);
        this.f15060e = size;
    }
}
