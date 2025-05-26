package il2;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.k1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends kotlin.collections.d {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f72571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f72572d;

    public g(i iVar) {
        this.f72572d = iVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f72571c = arrayDeque;
        boolean isDirectory = iVar.f72574a.isDirectory();
        File file = iVar.f72574a;
        if (isDirectory) {
            arrayDeque.push(c(file));
        } else if (file.isFile()) {
            arrayDeque.push(new d(file));
        } else {
            this.f80357a = k1.Done;
        }
    }

    @Override // kotlin.collections.d
    public final void b() {
        File file;
        File a13;
        int i13;
        while (true) {
            ArrayDeque arrayDeque = this.f72571c;
            h hVar = (h) arrayDeque.peek();
            if (hVar != null) {
                a13 = hVar.a();
                if (a13 != null) {
                    if (Intrinsics.d(a13, hVar.f72573a) || !a13.isDirectory()) {
                        break;
                    }
                    int size = arrayDeque.size();
                    i13 = this.f72572d.f72579f;
                    if (size >= i13) {
                        break;
                    } else {
                        arrayDeque.push(c(a13));
                    }
                } else {
                    arrayDeque.pop();
                }
            } else {
                file = null;
                break;
            }
        }
        file = a13;
        if (file == null) {
            this.f80357a = k1.Done;
        } else {
            this.f80358b = file;
            this.f80357a = k1.Ready;
        }
    }

    public final b c(File file) {
        int i13 = f.f72570a[this.f72572d.f72575b.ordinal()];
        if (i13 == 1) {
            return new e(this, file);
        }
        if (i13 == 2) {
            return new c(this, file);
        }
        throw new NoWhenBranchMatchedException();
    }
}
