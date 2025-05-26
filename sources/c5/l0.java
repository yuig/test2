package c5;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import ao2.m0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class l0 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25819a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f25820b;

    public l0(Context context) {
        this.f25820b = context;
    }

    public static l0 d(Context context) {
        return new l0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof k0 ? ((k0) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = m0.G(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f25820b.getPackageManager());
            }
            c(component);
            this.f25819a.add(supportParentActivityIntent);
        }
    }

    public final void c(ComponentName componentName) {
        Context context = this.f25820b;
        ArrayList arrayList = this.f25819a;
        int size = arrayList.size();
        try {
            for (Intent H = m0.H(context, componentName); H != null; H = m0.H(context, H.getComponent())) {
                arrayList.add(size, H);
            }
        } catch (PackageManager.NameNotFoundException e13) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e13);
        }
    }

    public final void e() {
        ArrayList arrayList = this.f25819a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = d5.a.f53679a;
        this.f25820b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f25819a.iterator();
    }
}
