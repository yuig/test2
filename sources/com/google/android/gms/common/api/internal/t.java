package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes.dex */
public final class t implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f30873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30874c;

    public /* synthetic */ t(Object obj, TaskCompletionSource taskCompletionSource, int i13) {
        this.f30872a = i13;
        this.f30874c = obj;
        this.f30873b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f30872a) {
            case 0:
                ((Map) ((tb.l) this.f30874c).f116987c).remove(this.f30873b);
                return;
            case 1:
                fi.i iVar = (fi.i) this.f30874c;
                TaskCompletionSource taskCompletionSource = this.f30873b;
                synchronized (iVar.f62194f) {
                    iVar.f62193e.remove(taskCompletionSource);
                }
                return;
            default:
                nk.c cVar = (nk.c) this.f30874c;
                TaskCompletionSource taskCompletionSource2 = this.f30873b;
                synchronized (cVar.f91067f) {
                    cVar.f91066e.remove(taskCompletionSource2);
                }
                return;
        }
    }
}
