package yh;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import rd.j;

/* loaded from: classes.dex */
public final class h extends com.google.android.gms.common.api.f implements ah.a {

    /* renamed from: m, reason: collision with root package name */
    public static final x92.b f139044m = new x92.b("AppSet.API", new qh.i(1), new com.google.android.gms.common.api.d());

    /* renamed from: k, reason: collision with root package name */
    public final Context f139045k;

    /* renamed from: l, reason: collision with root package name */
    public final ih.d f139046l;

    public h(Context context, ih.d dVar) {
        super(context, null, f139044m, com.google.android.gms.common.api.b.En, com.google.android.gms.common.api.e.f30758c);
        this.f139045k = context;
        this.f139046l = dVar;
    }

    @Override // ah.a
    public final Task a() {
        if (this.f139046l.c(this.f139045k, 212800000) != 0) {
            return Tasks.forException(new ApiException(new Status(17, null, null, null)));
        }
        q a13 = r.a();
        a13.f30860d = new Feature[]{ah.c.f15167a};
        a13.f30859c = new j(this, 10);
        a13.f30858b = false;
        a13.f30857a = 27601;
        return d(0, a13.a());
    }
}
