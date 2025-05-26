package j6;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import h6.m;

/* loaded from: classes.dex */
public final class a extends e3.b {

    /* renamed from: b, reason: collision with root package name */
    public final EditText f74791b;

    /* renamed from: c, reason: collision with root package name */
    public final k f74792c;

    public a(EditText editText) {
        super(27);
        this.f74791b = editText;
        k kVar = new k(editText);
        this.f74792c = kVar;
        editText.addTextChangedListener(kVar);
        if (c.f74797b == null) {
            synchronized (c.f74796a) {
                try {
                    if (c.f74797b == null) {
                        c cVar = new c();
                        try {
                            c.f74798c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c.f74797b = cVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(c.f74797b);
    }

    @Override // e3.b
    public final KeyListener c(KeyListener keyListener) {
        if (keyListener instanceof g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new g(keyListener);
    }

    @Override // e3.b
    public final InputConnection g(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof d ? inputConnection : new d(this.f74791b, inputConnection, editorInfo);
    }

    @Override // e3.b
    public final void k(boolean z13) {
        k kVar = this.f74792c;
        if (kVar.f74815d != z13) {
            if (kVar.f74814c != null) {
                m.a().i(kVar.f74814c);
            }
            kVar.f74815d = z13;
            if (z13) {
                k.a(kVar.f74812a, m.a().b());
            }
        }
    }
}
