package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class p0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30855c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30856d;

    public p0(j jVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f30856d = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final /* bridge */ /* synthetic */ void d(tb.l lVar, boolean z13) {
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final boolean f(z zVar) {
        int i13 = this.f30855c;
        Object obj = this.f30856d;
        switch (i13) {
            case 0:
                return ((j0) obj).f30836a.f16959c;
            default:
                j0 j0Var = (j0) zVar.f30906f.get((j) obj);
                return j0Var != null && j0Var.f30836a.f16959c;
        }
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final Feature[] g(z zVar) {
        int i13 = this.f30855c;
        Object obj = this.f30856d;
        switch (i13) {
            case 0:
                return (Feature[]) ((j0) obj).f30836a.f16961e;
            default:
                j0 j0Var = (j0) zVar.f30906f.get((j) obj);
                if (j0Var == null) {
                    return null;
                }
                return (Feature[]) j0Var.f30836a.f16961e;
        }
    }

    @Override // com.google.android.gms.common.api.internal.n0
    public final void h(z zVar) {
        int i13 = this.f30855c;
        TaskCompletionSource taskCompletionSource = this.f30853b;
        Object obj = this.f30856d;
        switch (i13) {
            case 0:
                j0 j0Var = (j0) obj;
                j0Var.f30836a.h(zVar.f30902b, taskCompletionSource);
                j jVar = ((l) j0Var.f30836a.f16960d).f30843c;
                if (jVar != null) {
                    zVar.f30906f.put(jVar, j0Var);
                    break;
                }
                break;
            default:
                j0 j0Var2 = (j0) zVar.f30906f.remove((j) obj);
                if (j0Var2 == null) {
                    taskCompletionSource.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    com.google.android.gms.internal.measurement.x xVar = j0Var2.f30837b;
                    xVar.getClass();
                    hi.i iVar = (hi.i) zVar.f30902b;
                    ((li.b) xVar.f31695c).getClass();
                    try {
                        iVar.e((j) xVar.f31694b, new li.a(taskCompletionSource, 0));
                    } catch (RuntimeException e13) {
                        taskCompletionSource.trySetException(e13);
                    }
                    l lVar = (l) j0Var2.f30836a.f16960d;
                    lVar.f30842b = null;
                    lVar.f30843c = null;
                    break;
                }
        }
    }

    public p0(j0 j0Var, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f30856d = j0Var;
    }
}
