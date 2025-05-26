package op1;

import com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource;

/* loaded from: classes5.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public HandshakeRemoteRemoteDataSource f96921r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f96922s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ HandshakeRemoteRemoteDataSource f96923t;

    /* renamed from: u, reason: collision with root package name */
    public int f96924u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HandshakeRemoteRemoteDataSource handshakeRemoteRemoteDataSource, bl2.c cVar) {
        super(cVar);
        this.f96923t = handshakeRemoteRemoteDataSource;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f96922s = obj;
        this.f96924u |= Integer.MIN_VALUE;
        return this.f96923t.deleteToken(this);
    }
}
