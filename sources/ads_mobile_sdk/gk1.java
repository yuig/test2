package ads_mobile_sdk;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class gk1 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f5597a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f5598b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f5599c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5600d;

    /* renamed from: e, reason: collision with root package name */
    public String f5601e;

    /* renamed from: f, reason: collision with root package name */
    public int f5602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nm.u f5603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mk1 f5604h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk1(mk1 mk1Var, nm.u uVar, bl2.c cVar) {
        super(1, cVar);
        this.f5603g = uVar;
        this.f5604h = mk1Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new gk1(this.f5604h, this.f5603g, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nm.u uVar = this.f5603g;
        return new gk1(this.f5604h, uVar, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:16:0x00f0, B:18:0x00f7, B:20:0x00fe, B:22:0x0102, B:24:0x0106, B:25:0x0109, B:26:0x010e, B:27:0x010f, B:28:0x0116, B:29:0x0117, B:30:0x011e, B:31:0x011f), top: B:15:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:16:0x00f0, B:18:0x00f7, B:20:0x00fe, B:22:0x0102, B:24:0x0106, B:25:0x0109, B:26:0x010e, B:27:0x010f, B:28:0x0116, B:29:0x0117, B:30:0x011e, B:31:0x011f), top: B:15:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb A[Catch: all -> 0x00ce, TryCatch #6 {all -> 0x00ce, blocks: (B:47:0x00b5, B:49:0x00bb, B:50:0x00d1), top: B:46:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1 A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #6 {all -> 0x00ce, blocks: (B:47:0x00b5, B:49:0x00bb, B:50:0x00d1), top: B:46:0x00b5 }] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gk1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
