package qv0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.api.model.dr;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oq.q0;

/* loaded from: classes5.dex */
public final class b0 extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f105157d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f105158a;

    /* renamed from: b, reason: collision with root package name */
    public final List f105159b;

    /* renamed from: c, reason: collision with root package name */
    public final nv0.b f105160c;

    public b0(Context context, ArrayList data, nv0.b actionListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        this.f105158a = context;
        this.f105159b = data;
        this.f105160c = actionListener;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f105159b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        return (dr) this.f105159b.get(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        String uid = ((dr) this.f105159b.get(i13)).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return Long.parseLong(uid);
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        dr drVar = (dr) this.f105159b.get(i13);
        String s13 = drVar.s();
        Intrinsics.checkNotNullExpressionValue(s13, "getDisplayName(...)");
        q0 q0Var = new q0(this.f105158a, s13, drVar.u());
        q0Var.setOnClickListener(new xa0.m(28, this, drVar));
        return q0Var;
    }
}
