package so2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends g {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f114794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r writer, boolean z13) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f114794c = z13;
    }

    @Override // so2.g
    public final void j(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f114794c) {
            super.j(value);
        } else {
            h(value);
        }
    }
}
