package m7;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.pinterest.service.PinUploaderService;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x02.d2;

/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements d7.r, ue.h, uj2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f86187a;

    public /* synthetic */ h0(List list) {
        this.f86187a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0172 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00de  */
    @Override // ue.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.io.File r19) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.h0.a(java.io.File):void");
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        ((a7.t0) obj).U1(this.f86187a);
    }

    @Override // uj2.e
    public final void n(fk2.f completableEmitter) {
        List<d2> paramsList = this.f86187a;
        Intrinsics.checkNotNullParameter(paramsList, "$paramsList");
        Intrinsics.checkNotNullParameter(completableEmitter, "completableEmitter");
        for (d2 d2Var : paramsList) {
            vb0.j.f125466a.S(!kotlin.text.z.j(d2Var.f131330k), "Upload ID must be set", new Object[0]);
            String filename = d2Var.f131330k;
            Intrinsics.checkNotNullParameter(filename, "filename");
            String U = df.j1.U("%s%s%s", new Object[]{l3.c.H(), File.separator, filename});
            File file = new File(U);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
            com.bumptech.glide.d.D0(new File(U), d2Var.a().f125623a.toString());
        }
        Context context = kb0.a.f79058b;
        m60.f0.W();
        String str = fp1.d.f62784a;
        lb0.b bVar = (lb0.b) lb0.n.f82722a.a();
        if (!bVar.e("ARater__DONT_SHOW", false)) {
            lb0.m c13 = bVar.c();
            c13.putLong("ARater__EVENTS", bVar.g("ARater__EVENTS", 0L) + 1);
            c13.apply();
        }
        Application W = m60.f0.W();
        W.startService(new Intent(W, (Class<?>) PinUploaderService.class));
        completableEmitter.b();
    }
}
