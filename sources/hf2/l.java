package hf2;

import android.os.Bundle;
import ao2.j0;
import ao2.v0;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f69052r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ mp2.g f69053s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f69054t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, mp2.g gVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f69052r = iVar;
        this.f69053s = gVar;
        this.f69054t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f69052r, this.f69053s, this.f69054t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        File file;
        mp2.f fVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        i iVar = this.f69052r;
        mp2.g gVar = this.f69053s;
        String str = this.f69054t;
        iVar.f69042j = gVar;
        if (gVar != null) {
            boolean z13 = gVar.f87938a;
            iVar.f69045m = z13;
            if (z13) {
                oa.b bVar = iVar.f69033a.f().f75178a;
                if (Intrinsics.d(bVar != null ? Boolean.valueOf(bVar.isOpen()) : null, Boolean.TRUE)) {
                    ko2.f fVar2 = v0.f20219a;
                    kotlin.jvm.internal.j.z(dl2.b.b(ko2.e.f80326c), null, null, new g(iVar, null), 3);
                } else {
                    tq2.a.f119026a.getClass();
                    t72.j.r(new Object[0]);
                }
            }
        }
        iVar.f69033a.i(a.a.m("Connecting {", iVar.f69034b, "} as {", iVar.f69035c, "}"));
        Bundle resultBundle = new Bundle();
        resultBundle.putString(".activityToken", str);
        resultBundle.putString(".invocationContext", null);
        resultBundle.putString(".callbackAction", "connect");
        try {
            if (iVar.f69036d == null) {
                try {
                    file = iVar.f69033a.getDir("MqttConnection", 0);
                } catch (Exception unused) {
                    file = null;
                }
                if (file == null) {
                    try {
                        file = iVar.f69033a.getFilesDir();
                        if (file != null) {
                            File file2 = new File(file.getAbsolutePath() + File.separator);
                            file2.mkdirs();
                            file = file2;
                        }
                    } catch (Exception unused2) {
                        file = null;
                    }
                }
                if (file == null) {
                    fVar = new qp2.a();
                } else {
                    String absolutePath = file.getAbsolutePath();
                    qp2.b bVar2 = new qp2.b();
                    bVar2.f104858a = null;
                    bVar2.f104859b = null;
                    new File(absolutePath);
                    fVar = bVar2;
                }
                iVar.f69036d = fVar;
            }
            Intrinsics.checkNotNullParameter(resultBundle, "resultBundle");
            iVar.f69043k = new if2.a(iVar.f69033a);
            synchronized (iVar) {
            }
            pp2.b.a("mp2.d");
            throw null;
        } catch (Exception e13) {
            iVar.f69033a.j("Exception occurred attempting to connect: " + e13.getMessage());
            synchronized (iVar) {
                resultBundle.putString(".errorMessage", e13.getLocalizedMessage());
                resultBundle.putSerializable(".exception", e13);
                iVar.f69033a.b(iVar.f69037e, r.ERROR, resultBundle);
                return Unit.f80348a;
            }
        }
    }
}
