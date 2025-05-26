package op1;

import com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource;

/* loaded from: classes2.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public HandshakeRemoteRemoteDataSource f96933r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f96934s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ HandshakeRemoteRemoteDataSource f96935t;

    /* renamed from: u, reason: collision with root package name */
    public int f96936u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HandshakeRemoteRemoteDataSource handshakeRemoteRemoteDataSource, bl2.c cVar) {
        super(cVar);
        this.f96935t = handshakeRemoteRemoteDataSource;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f96934s = obj;
        this.f96936u |= Integer.MIN_VALUE;
        return this.f96935t.getToken(this);
    }
}
