package op1;

import com.pinterest.handshake.model.HandshakeRemoteRemoteDataSource;

/* loaded from: classes2.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public HandshakeRemoteRemoteDataSource f96925r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f96926s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ HandshakeRemoteRemoteDataSource f96927t;

    /* renamed from: u, reason: collision with root package name */
    public int f96928u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HandshakeRemoteRemoteDataSource handshakeRemoteRemoteDataSource, bl2.c cVar) {
        super(cVar);
        this.f96927t = handshakeRemoteRemoteDataSource;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f96926s = obj;
        this.f96928u |= Integer.MIN_VALUE;
        return this.f96927t.getApiKey(this);
    }
}
