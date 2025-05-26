package d0;

import c0.m0;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class v implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53577b = 4;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f53578c;

    public v(int i13, ByteBuffer byteBuffer) {
        this.f53576a = i13;
        this.f53578c = byteBuffer;
    }

    @Override // c0.m0
    public final ByteBuffer l() {
        return this.f53578c;
    }

    @Override // c0.m0
    public final int m() {
        return this.f53576a;
    }

    @Override // c0.m0
    public final int n() {
        return this.f53577b;
    }
}
