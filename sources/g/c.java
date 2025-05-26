package g;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.q;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f63159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f63160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.a f63161c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f63162d;

    public c(g gVar, String str, a aVar, h.a aVar2) {
        this.f63162d = gVar;
        this.f63159a = str;
        this.f63160b = aVar;
        this.f63161c = aVar2;
    }

    @Override // androidx.lifecycle.x
    public final void c(z zVar, q qVar) {
        boolean equals = q.ON_START.equals(qVar);
        String str = this.f63159a;
        g gVar = this.f63162d;
        if (!equals) {
            if (q.ON_STOP.equals(qVar)) {
                gVar.f63175e.remove(str);
                return;
            } else {
                if (q.ON_DESTROY.equals(qVar)) {
                    gVar.g(str);
                    return;
                }
                return;
            }
        }
        HashMap hashMap = gVar.f63175e;
        h.a aVar = this.f63161c;
        a aVar2 = this.f63160b;
        hashMap.put(str, new e(aVar, aVar2));
        HashMap hashMap2 = gVar.f63176f;
        if (hashMap2.containsKey(str)) {
            Object obj = hashMap2.get(str);
            hashMap2.remove(str);
            aVar2.c(obj);
        }
        Bundle bundle = gVar.f63177g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            aVar2.c(aVar.c(activityResult.a(), activityResult.b()));
        }
    }
}
