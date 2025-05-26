package os;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.api.model.Feed;
import df.j1;
import dl1.s;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class l extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public Feed f97490a;

    /* renamed from: b, reason: collision with root package name */
    public View[] f97491b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f97492c;

    static {
        hf0.b.q();
    }

    public final Feed a() {
        return this.f97490a;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final s getItem(int i13) {
        Feed feed = this.f97490a;
        if (feed != null) {
            return feed.k(i13);
        }
        return null;
    }

    public abstract View c(int i13, View view, ViewGroup viewGroup, boolean z13);

    public final void d() {
        HashMap hashMap = this.f97492c;
        Intrinsics.f(hashMap);
        hashMap.clear();
    }

    public final boolean e(Bundle bundle) {
        Feed feed;
        Feed F;
        if (bundle == null || (((feed = this.f97490a) != null && feed.l() > 0) || (F = Feed.F("__FEED", bundle)) == null || F.n() <= 0)) {
            return false;
        }
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h(j1.U("%s.restoreInstanceState: restored", new Object[]{getClass().getSimpleName()}));
        g(F);
        return true;
    }

    public final Bundle f(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        Feed feed = this.f97490a;
        if (feed != null && feed.l() > 0) {
            Feed feed2 = this.f97490a;
            Intrinsics.f(feed2);
            feed2.G(bundle2);
            bundle2.putParcelable("__FEED", feed2);
        }
        return bundle2;
    }

    public final void g(Feed feed) {
        this.f97490a = feed;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Feed feed = this.f97490a;
        if (feed != null) {
            return feed.n();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return c(i13, view, viewGroup, false);
    }
}
