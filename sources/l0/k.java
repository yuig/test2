package l0;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.i1;
import androidx.recyclerview.widget.o3;
import androidx.recyclerview.widget.p3;
import c2.n2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.view.behavior.BottomNavigationBehavior;
import d7.d0;
import java.util.Arrays;
import pk.c1;
import pk.v2;
import q5.e1;
import q8.i0;

/* loaded from: classes2.dex */
public final class k implements i0, p3, r5.p, cl.a, e1 {

    /* renamed from: a */
    public final /* synthetic */ int f81234a;

    /* renamed from: b */
    public int f81235b;

    /* renamed from: c */
    public Object f81236c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i13) {
        this(32, 1);
        this.f81234a = i13;
        if (i13 == 3) {
            this.f81236c = new d0(8);
            return;
        }
        if (i13 == 11) {
            this.f81236c = yl.d.DEFAULT;
            return;
        }
        if (i13 == 5) {
            this.f81236c = new SparseArray();
            this.f81235b = 0;
        } else if (i13 != 6) {
        } else {
            this(10, 6);
        }
    }

    public static k k() {
        return new k(11);
    }

    @Override // q5.e1
    public final void a() {
        boolean z13 = this.f81235b <= 0;
        BottomNavigationBehavior bottomNavigationBehavior = (BottomNavigationBehavior) this.f81236c;
        bottomNavigationBehavior.f49949f = z13;
        bottomNavigationBehavior.f49950g = !z13;
    }

    @Override // q5.e1
    public final void b() {
        BottomNavigationBehavior bottomNavigationBehavior = (BottomNavigationBehavior) this.f81236c;
        bottomNavigationBehavior.f49949f = false;
        bottomNavigationBehavior.f49950g = false;
    }

    @Override // androidx.recyclerview.widget.p3
    public final i1 c(int i13) {
        i1 i1Var = (i1) ((SparseArray) this.f81236c).get(i13);
        if (i1Var != null) {
            return i1Var;
        }
        throw new IllegalArgumentException(a.a.d("Cannot find the wrapper for global view type ", i13));
    }

    @Override // q5.e1
    public final void d(View view) {
        BottomNavigationBehavior bottomNavigationBehavior = (BottomNavigationBehavior) this.f81236c;
        bottomNavigationBehavior.f49949f = false;
        bottomNavigationBehavior.f49950g = false;
        float translationY = view.getTranslationY();
        float f13 = this.f81235b;
        if (translationY != f13) {
            view.setTranslationY(f13);
        }
    }

    @Override // cl.a
    public final byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = cl.b.f27928a;
        int i13 = 3;
        switch (this.f81234a) {
            case 9:
                byte[] copyOf = Arrays.copyOf(bArr, ((vk.l) this.f81236c).f125984a);
                vk.l lVar = (vk.l) this.f81236c;
                int i14 = lVar.f125984a;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i14, lVar.f125985b + i14);
                m.h hVar = new m.h();
                hVar.f85197b = (vk.l) this.f81236c;
                hVar.f85198c = new ll.j(ml.a.a(copyOf), i13);
                hVar.f85199d = new ll.j(ml.a.a(copyOfRange), i13);
                return kg.t.u(bArr2, bArr3, ll.q.c(hVar.t()).a(bArr4, bArr5));
            default:
                gi.m mVar = new gi.m((gi.k) null);
                mVar.f65093b = (zk.f) this.f81236c;
                mVar.f65095d = new ll.j(ml.a.a(bArr), i13);
                zk.a r13 = mVar.r();
                return kg.t.u(bArr2, bArr3, new ll.d(((ml.a) r13.f142062c.f83754b).b(), r13.f142063d).a(bArr4, bArr5));
        }
    }

    @Override // androidx.recyclerview.widget.p3
    public final o3 f(i1 i1Var) {
        return new m.h(this, i1Var);
    }

    public final void g(long j13) {
        int i13 = this.f81235b;
        Object obj = this.f81236c;
        if (i13 == ((long[]) obj).length) {
            this.f81236c = Arrays.copyOf((long[]) obj, i13 * 2);
        }
        long[] jArr = (long[]) this.f81236c;
        int i14 = this.f81235b;
        this.f81235b = i14 + 1;
        jArr[i14] = j13;
    }

    @Override // cl.a
    public final int h() {
        switch (this.f81234a) {
        }
        return this.f81235b;
    }

    public final void i(long[] jArr) {
        int length = this.f81235b + jArr.length;
        Object obj = this.f81236c;
        if (length > ((long[]) obj).length) {
            this.f81236c = Arrays.copyOf((long[]) obj, Math.max(((long[]) obj).length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f81236c, this.f81235b, jArr.length);
        this.f81235b = length;
    }

    public final yl.a j() {
        return new yl.a(this.f81235b, (yl.d) this.f81236c);
    }

    @Override // r5.p
    public final boolean l(View view) {
        ((BottomSheetBehavior) this.f81236c).X(this.f81235b);
        return true;
    }

    public final long m(int i13) {
        if (i13 >= 0 && i13 < this.f81235b) {
            return ((long[]) this.f81236c)[i13];
        }
        StringBuilder s13 = a.a.s("Invalid index ", i13, ", size is ");
        s13.append(this.f81235b);
        throw new IndexOutOfBoundsException(s13.toString());
    }

    public final String n(char[] cArr, int i13) {
        long j13 = -2128831035;
        for (int i14 = 0; i14 < i13; i14++) {
            j13 = (j13 ^ ((byte) cArr[i14])) * 16777619;
        }
        int i15 = ((int) j13) & this.f81235b;
        String str = ((String[]) this.f81236c)[i15];
        if (str == null) {
            String str2 = new String(cArr, 0, i13);
            ((String[]) this.f81236c)[i15] = str2;
            return str2;
        }
        if (str.length() != i13) {
            String str3 = new String(cArr, 0, i13);
            ((String[]) this.f81236c)[i15] = str3;
            return str3;
        }
        for (int i16 = 0; i16 < str.length(); i16++) {
            if (str.charAt(i16) != cArr[i16]) {
                String str4 = new String(cArr, 0, i13);
                ((String[]) this.f81236c)[i15] = str4;
                return str4;
            }
        }
        return str;
    }

    public final String o() {
        int i13 = this.f81235b;
        if (i13 == -1) {
            return null;
        }
        int indexOf = ((String) this.f81236c).indexOf(46, i13);
        if (indexOf == -1) {
            String substring = ((String) this.f81236c).substring(this.f81235b);
            this.f81235b = -1;
            return substring;
        }
        String substring2 = ((String) this.f81236c).substring(this.f81235b, indexOf);
        this.f81235b = indexOf + 1;
        return substring2;
    }

    public final long p(q8.t tVar) {
        int i13 = 0;
        tVar.s(((d0) this.f81236c).f53806a, 0, 1);
        int i14 = ((d0) this.f81236c).f53806a[0] & 255;
        if (i14 == 0) {
            return Long.MIN_VALUE;
        }
        int i15 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i16 = 0;
        while ((i14 & i15) == 0) {
            i15 >>= 1;
            i16++;
        }
        int i17 = i14 & (~i15);
        tVar.s(((d0) this.f81236c).f53806a, 1, i16);
        while (i13 < i16) {
            i13++;
            i17 = (((d0) this.f81236c).f53806a[i13] & 255) + (i17 << 8);
        }
        this.f81235b = i16 + 1 + this.f81235b;
        return i17;
    }

    public k(int i13, int i14) {
        this.f81234a = i14;
        if (i14 != 6) {
            if (i14 != 12) {
                this.f81236c = new long[i13];
                return;
            } else {
                this.f81236c = new byte[i13];
                this.f81235b = 0;
                return;
            }
        }
        int i15 = 2;
        for (int i16 = 1; i16 < i13; i16++) {
            i15 *= 2;
        }
        this.f81235b = i15 - 1;
        this.f81236c = new String[i15];
    }

    public /* synthetic */ k(Object obj, int i13, int i14) {
        this.f81234a = i14;
        this.f81236c = obj;
        this.f81235b = i13;
    }

    public k(String str) {
        this.f81234a = 15;
        this.f81236c = str;
        this.f81235b = 0;
    }

    public k(int[] iArr, int i13) {
        sk.a aVar;
        this.f81234a = 4;
        this.f81235b = i13;
        if (iArr != null) {
            sk.a aVar2 = sk.a.f113037c;
            aVar = iArr.length == 0 ? sk.a.f113037c : new sk.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = sk.a.f113037c;
        }
        this.f81236c = aVar;
    }

    public k(int i13, v2 v2Var) {
        this.f81234a = 2;
        this.f81235b = i13;
        this.f81236c = c1.r(v2Var);
    }

    public k(vk.l lVar) {
        this.f81234a = 9;
        this.f81236c = lVar;
        this.f81235b = lVar.f125984a + lVar.f125985b;
    }

    public k(int i13, n2[] n2VarArr) {
        this.f81234a = 13;
        this.f81235b = i13;
        this.f81236c = n2VarArr;
    }

    public k(zk.f fVar) {
        this.f81234a = 10;
        this.f81236c = fVar;
        this.f81235b = fVar.f142074a;
    }
}
