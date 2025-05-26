package jk;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import i2.a2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class i extends kk.u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f76338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection f76339c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2 f76340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f76341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f76342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, TaskCompletionSource taskCompletionSource, List list, ArrayList arrayList, a2 a2Var, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f76342f = lVar;
        this.f76338b = list;
        this.f76339c = arrayList;
        this.f76340d = a2Var;
        this.f76341e = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [android.os.IInterface, kk.k] */
    @Override // kk.u
    public final void c() {
        TaskCompletionSource taskCompletionSource = this.f76341e;
        l lVar = this.f76342f;
        a2 a2Var = this.f76340d;
        Collection collection = this.f76338b;
        ArrayList b13 = l.b(collection);
        Collection<String> collection2 = this.f76339c;
        ArrayList arrayList = new ArrayList(collection2.size());
        for (String str : collection2) {
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        b13.addAll(arrayList);
        try {
            a2Var.getClass();
            a2Var.f71073a.add(new kk.s(2, System.currentTimeMillis()));
            lVar.f76349b.f79877m.c(lVar.f76348a, b13, l.a(a2Var), new j(lVar, taskCompletionSource, 1));
        } catch (RemoteException e13) {
            l.f76346c.d("startInstall(%s,%s)", e13, collection, collection2);
            taskCompletionSource.trySetException(new RuntimeException(e13));
        }
    }
}
