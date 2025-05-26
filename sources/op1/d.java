package op1;

import com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource;

/* loaded from: classes5.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public HandshakeRemoteRemoteDataSource f96929r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f96930s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ HandshakeRemoteRemoteDataSource f96931t;

    /* renamed from: u, reason: collision with root package name */
    public int f96932u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HandshakeRemoteRemoteDataSource handshakeRemoteRemoteDataSource, bl2.c cVar) {
        super(cVar);
        this.f96931t = handshakeRemoteRemoteDataSource;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f96930s = obj;
        this.f96932u |= Integer.MIN_VALUE;
        return this.f96931t.getLoginUrl(0, this);
    }
}
