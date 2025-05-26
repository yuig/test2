package j6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.widget.EditText;
import d7.d0;
import d7.n0;
import d7.u;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements j9.d {

    /* renamed from: a, reason: collision with root package name */
    public int f74793a;

    /* renamed from: b, reason: collision with root package name */
    public int f74794b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f74795c;

    public b(Context context) {
        this.f74794b = 0;
        this.f74795c = context;
    }

    @Override // j9.d
    public final int a() {
        int i13 = this.f74793a;
        return i13 == -1 ? ((d0) this.f74795c).C() : i13;
    }

    @Override // j9.d
    public final int b() {
        return this.f74793a;
    }

    @Override // j9.d
    public final int c() {
        return this.f74794b;
    }

    public final boolean d(int i13) {
        int i14 = i13 - this.f74794b;
        int i15 = this.f74793a;
        Object obj = this.f74795c;
        if (i14 >= i15) {
            this.f74794b = i13;
            ((g1.h) obj).add(Integer.valueOf(i13));
        }
        return ((g1.h) obj).contains(Integer.valueOf(i13));
    }

    public final synchronized int e() {
        int i13 = this.f74794b;
        if (i13 != 0) {
            return i13;
        }
        PackageManager packageManager = ((Context) this.f74795c).getPackageManager();
        if (ph.b.a((Context) this.f74795c).f67746a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f74794b = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f74794b = 2;
        return 2;
    }

    public b(float f13, float f14, int i13) {
        float f15 = i13;
        int i14 = (int) (((f14 / ((f13 / f15) * 3.0f)) * f15) / 1);
        this.f74793a = i14;
        this.f74794b = -i14;
        this.f74795c = new g1.h(0);
    }

    public b(EditText editText) {
        this.f74793a = Integer.MAX_VALUE;
        this.f74794b = 0;
        com.bumptech.glide.d.s(editText, "editText cannot be null");
        this.f74795c = new a(editText);
    }

    public b(e7.d dVar, androidx.media3.common.b bVar) {
        d0 d0Var = dVar.f57528c;
        this.f74795c = d0Var;
        d0Var.K(12);
        int C = d0Var.C();
        if ("audio/raw".equals(bVar.f18765o)) {
            int u13 = n0.u(bVar.G) * bVar.E;
            if (C == 0 || C % u13 != 0) {
                u.g("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u13 + ", stsz sample size: " + C);
                C = u13;
            }
        }
        this.f74793a = C == 0 ? -1 : C;
        this.f74794b = d0Var.C();
    }
}
