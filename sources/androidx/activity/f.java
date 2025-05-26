package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements ma.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15889b;

    public /* synthetic */ f(Object obj, int i13) {
        this.f15888a = i13;
        this.f15889b = obj;
    }

    @Override // ma.f
    public final Bundle a() {
        Bundle lambda$init$0;
        int i13 = this.f15888a;
        Object obj = this.f15889b;
        switch (i13) {
            case 0:
                return o.k((o) obj);
            case 1:
                Map c13 = ((r2.k) obj).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : c13.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 2:
                lambda$init$0 = ((FragmentActivity) obj).lambda$init$0();
                return lambda$init$0;
            default:
                return ((w0) obj).c0();
        }
    }
}
