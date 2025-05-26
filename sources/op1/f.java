package op1;

import com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource;

/* loaded from: classes5.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public HandshakeRemoteRemoteDataSource f96937r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f96938s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ HandshakeRemoteRemoteDataSource f96939t;

    /* renamed from: u, reason: collision with root package name */
    public int f96940u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(HandshakeRemoteRemoteDataSource handshakeRemoteRemoteDataSource, bl2.c cVar) {
        super(cVar);
        this.f96939t = handshakeRemoteRemoteDataSource;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f96938s = obj;
        this.f96940u |= Integer.MIN_VALUE;
        return this.f96939t.linkAccount(null, 0, this);
    }
}
