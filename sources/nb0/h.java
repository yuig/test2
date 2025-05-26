package nb0;

import java.util.Base64;

/* loaded from: classes5.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public String f90218r;

    /* renamed from: s, reason: collision with root package name */
    public String f90219s;

    /* renamed from: t, reason: collision with root package name */
    public com.pinterest.encryption.dataEncryptionLibrary.a f90220t;

    /* renamed from: u, reason: collision with root package name */
    public Base64.Decoder f90221u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f90222v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f90223w;

    /* renamed from: x, reason: collision with root package name */
    public int f90224x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t tVar, bl2.c cVar) {
        super(cVar);
        this.f90223w = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90222v = obj;
        this.f90224x |= Integer.MIN_VALUE;
        return t.p(this.f90223w, null, null, null, null, this);
    }
}
