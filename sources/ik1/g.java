package ik1;

import ao2.j0;
import ao2.v0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.text.z;
import lh0.o;
import lh0.z3;
import m60.f0;
import tb0.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final se2.a f72411a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f72412b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f72413c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f72414d;

    /* renamed from: e, reason: collision with root package name */
    public final ko2.e f72415e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f72416f;

    /* renamed from: g, reason: collision with root package name */
    public int f72417g;

    /* renamed from: h, reason: collision with root package name */
    public long f72418h;

    public g(o experimentHelper, se2.a dataStoreManager, j0 applicationScope, f0 devUtils) {
        Intrinsics.checkNotNullParameter(experimentHelper, "experimentHelper");
        Intrinsics.checkNotNullParameter(dataStoreManager, "dataStoreManager");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        this.f72411a = dataStoreManager;
        this.f72412b = applicationScope;
        this.f72413c = devUtils;
        String e13 = experimentHelper.e("android_closeup_computation_reduction_model_based", z3.ACTIVATE_EXPERIMENT);
        this.f72414d = e13 != null ? z.p(e13, "enabled", false) : false;
        ko2.f fVar = v0.f20219a;
        this.f72415e = ko2.e.f80326c;
        ArrayList arrayList = new ArrayList(30);
        for (int i13 = 0; i13 < 30; i13++) {
            arrayList.add(new a(c.NO_ACTION));
        }
        this.f72416f = arrayList;
        this.f72418h = System.currentTimeMillis() / 1000;
        if (this.f72414d) {
            j.z(this.f72412b, this.f72415e, null, new f(this, null), 2);
        }
    }

    public final void a() {
        this.f72417g = 0;
        this.f72418h = System.currentTimeMillis() / 1000;
    }

    public final void b(a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z13 = this.f72414d;
        if (z13) {
            this.f72416f.add(action);
            if (this.f72416f.size() > 30) {
                this.f72416f.remove(0);
            }
            this.f72413c.R(this.f72416f.size() == 30, "actions should always have a size of ACTIONS_MAX_SIZE", p.USER_SEQUENCE, new Object[0]);
            this.f72417g++;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (this.f72417g < 3 || currentTimeMillis - this.f72418h < 300 || !z13) {
                return;
            }
            a();
            j.z(this.f72412b, this.f72415e, null, new d(this, null), 2);
        }
    }
}
