package c91;

import android.app.Activity;
import android.content.res.Resources;
import h32.f1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes2.dex */
public final class b implements jk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f26974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk.b f26975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f26976c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f26977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f26978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Resources f26979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f26980g;

    public b(d dVar, jk.b bVar, Activity activity, List list, d0 d0Var, Resources resources, String str) {
        this.f26974a = dVar;
        this.f26975b = bVar;
        this.f26976c = activity;
        this.f26977d = list;
        this.f26978e = d0Var;
        this.f26979f = resources;
        this.f26980g = str;
    }

    public final void a(int i13) {
        if (i13 != 5) {
            f1 f1Var = f1.ANDROID_DFM_DOWNLOAD_STATUS;
            HashMap o13 = ep.b.o("status_code", "final status failed");
            Unit unit = Unit.f80348a;
            this.f26978e.g(f1Var, "", o13, false);
        }
    }

    public final void b(Object obj) {
        jk.d state = (jk.d) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = state.f76321b;
        f1 f1Var = f1.ANDROID_DFM_DOWNLOAD_STATUS;
        HashMap hashMap = new HashMap();
        hashMap.put("status_code", String.valueOf(i13));
        Unit unit = Unit.f80348a;
        d0 d0Var = this.f26978e;
        d0Var.g(f1Var, "", hashMap, false);
        d dVar = this.f26974a;
        int i14 = state.f76321b;
        if (i14 != 2) {
            jk.b bVar = this.f26975b;
            Activity activity = this.f26976c;
            if (i14 == 5) {
                dVar.f26985c = false;
                dVar.f26986d = false;
                bVar.b(this);
                dVar.getClass();
                Iterator it = this.f26977d.iterator();
                while (it.hasNext()) {
                    ((hp1.a) it.next()).getClass();
                    try {
                        jk.a.a(activity.createPackageContext(activity.getPackageName(), 0), "MFEMakeupKit");
                    } catch (UnsatisfiedLinkError unused) {
                        f1 f1Var2 = f1.ANDROID_DFM_DOWNLOAD_STATUS;
                        HashMap x13 = a.a.x("name", "MFEMakeupKit", "status_code", "failed to load native lib");
                        Unit unit2 = Unit.f80348a;
                        d0Var.g(f1Var2, "", x13, false);
                    }
                }
                a(i14);
            } else if (i14 == 6 || i14 == 7) {
                dVar.f26985c = false;
                dVar.f26986d = false;
                bVar.b(this);
                a(i14);
                dVar.getClass();
            } else if (i14 == 8 && !dVar.f26987e) {
                bVar.e(state, activity);
            }
        } else if (!dVar.f26985c) {
            dVar.f26985c = true;
        }
        Resources resources = this.f26979f;
        Intrinsics.checkNotNullExpressionValue(resources, "$resources");
        this.f26974a.d(this.f26977d, resources, this.f26978e, this.f26980g, state.f76321b);
    }
}
