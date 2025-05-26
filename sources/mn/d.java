package mn;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.x;
import fn.i;
import hn.h;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d extends a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(x xVar, HashSet hashSet, JSONObject jSONObject, long j13, int i13) {
        super(xVar, hashSet, jSONObject, j13);
        this.f87752f = i13;
    }

    @Override // mn.b
    /* renamed from: a */
    public final void onPostExecute(String str) {
        hn.c cVar;
        h hVar = h.f69603a;
        HashSet hashSet = this.f87747c;
        int i13 = this.f87752f;
        long j13 = this.f87749e;
        switch (i13) {
            case 0:
                hn.c cVar2 = hn.c.f69594c;
                if (cVar2 != null) {
                    for (i iVar : Collections.unmodifiableCollection(cVar2.f69595a)) {
                        if (hashSet.contains(iVar.f62598h)) {
                            jn.b bVar = iVar.f62595e;
                            if (j13 >= bVar.f77074f) {
                                jn.a aVar = bVar.f77073e;
                                jn.a aVar2 = jn.a.AD_STATE_NOTVISIBLE;
                                if (aVar != aVar2) {
                                    bVar.f77073e = aVar2;
                                    hVar.a(bVar.j(), "setNativeViewHierarchy", str, bVar.f77069a);
                                }
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (cVar = hn.c.f69594c) != null) {
                    for (i iVar2 : Collections.unmodifiableCollection(cVar.f69595a)) {
                        if (hashSet.contains(iVar2.f62598h)) {
                            jn.b bVar2 = iVar2.f62595e;
                            if (j13 >= bVar2.f77074f) {
                                bVar2.f77073e = jn.a.AD_STATE_VISIBLE;
                                hVar.a(bVar2.j(), "setNativeViewHierarchy", str, bVar2.f77069a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        x xVar = this.f87751b;
        JSONObject jSONObject = this.f87748d;
        int i13 = this.f87752f;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        break;
                    default:
                        if (!kn.b.f(jSONObject, (JSONObject) xVar.f31694b)) {
                            xVar.f31694b = jSONObject;
                            break;
                        }
                        break;
                }
            default:
                switch (i13) {
                    case 0:
                        break;
                    default:
                        if (!kn.b.f(jSONObject, (JSONObject) xVar.f31694b)) {
                            xVar.f31694b = jSONObject;
                            break;
                        }
                        break;
                }
        }
        return jSONObject.toString();
    }

    @Override // mn.b, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f87752f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
