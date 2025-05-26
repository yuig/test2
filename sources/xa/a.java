package xa;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObservable f134373a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    public DataSetObserver f134374b;

    public abstract void a(ViewGroup viewGroup, int i13, Object obj);

    public abstract int b();

    public int c(Object obj) {
        return -1;
    }

    public CharSequence d(int i13) {
        return null;
    }

    public abstract Object e(ViewGroup viewGroup, int i13);

    public abstract boolean f(View view, Object obj);

    public final void g() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f134374b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f134373a.notifyChanged();
    }

    public void h(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable i() {
        return null;
    }

    public void j(ViewGroup viewGroup, int i13, Object obj) {
    }
}
