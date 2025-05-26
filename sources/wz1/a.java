package wz1;

import ao2.j0;
import bl2.c;
import com.pinterest.qrCodeLogin.h0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f131235r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0 f131236s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f131237t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f131238u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h0 h0Var, b bVar, r rVar, c cVar) {
        super(2, cVar);
        this.f131236s = h0Var;
        this.f131237t = bVar;
        this.f131238u = rVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f131236s, this.f131237t, this.f131238u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wz1.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
