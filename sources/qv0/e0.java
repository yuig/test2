package qv0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.api.model.zq;
import java.util.ArrayList;
import java.util.List;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Context f105178a;

    /* renamed from: b, reason: collision with root package name */
    public final List f105179b;

    /* renamed from: c, reason: collision with root package name */
    public final nv0.b f105180c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.l f105181d;

    public e0(Context context, ArrayList data, nv0.b actionListener, com.bumptech.glide.l imageRequestBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        Intrinsics.checkNotNullParameter(imageRequestBuilder, "imageRequestBuilder");
        this.f105178a = context;
        this.f105179b = data;
        this.f105180c = actionListener;
        this.f105181d = imageRequestBuilder;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f105179b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        return (zq) this.f105179b.get(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        String uid = ((zq) this.f105179b.get(i13)).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return Long.parseLong(uid);
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        r rVar = new r(this.f105178a, this.f105181d);
        zq zqVar = (zq) this.f105179b.get(i13);
        if (g0.e0(zqVar)) {
            String y13 = zqVar.y();
            Intrinsics.checkNotNullExpressionValue(y13, "getThumbnailImageURL(...)");
            rVar.a(y13);
        } else {
            String y14 = zqVar.y();
            Intrinsics.checkNotNullExpressionValue(y14, "getThumbnailImageURL(...)");
            rVar.b(y14);
        }
        rVar.setOnClickListener(new d0(0, this, zqVar));
        return rVar;
    }
}
