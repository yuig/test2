package ye;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qe.h;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f138823a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final List f138824b = f0.j(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    public static final ArrayList a(View view) {
        if (p001if.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator it = f138824b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = h.a(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th3) {
            p001if.a.a(c.class, th3);
            return null;
        }
    }

    public static final JSONObject b(View view, View clickedView) {
        if (p001if.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = h.a(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th3) {
            p001if.a.a(c.class, th3);
            return null;
        }
    }

    public static final String d(View hostView) {
        if (p001if.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String i13 = h.i(hostView);
            if (i13.length() > 0) {
                return i13;
            }
            String join = TextUtils.join(" ", f138823a.c(hostView));
            Intrinsics.checkNotNullExpressionValue(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th3) {
            p001if.a.a(c.class, th3);
            return null;
        }
    }

    public static final void e(View view, JSONObject json) {
        if (p001if.a.b(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String i13 = h.i(view);
                String g13 = h.g(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", h.b(view));
                if (i13.length() > 0) {
                    json.put("text", i13);
                }
                if (g13.length() > 0) {
                    json.put("hint", g13);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th3) {
            p001if.a.a(c.class, th3);
        }
    }

    public final ArrayList c(View view) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = h.a(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String i13 = h.i(view2);
                if (i13.length() > 0) {
                    arrayList.add(i13);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }
}
