package o6;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final e[] f92924a;

    /* renamed from: b, reason: collision with root package name */
    public int f92925b;

    /* renamed from: c, reason: collision with root package name */
    public final e[][] f92926c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f92927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.gridlayout.widget.a f92928e;

    public g(androidx.gridlayout.widget.a aVar, e[] eVarArr) {
        this.f92928e = aVar;
        int length = eVarArr.length;
        this.f92924a = new e[length];
        this.f92925b = length - 1;
        int g13 = aVar.g() + 1;
        e[][] eVarArr2 = new e[g13][];
        int[] iArr = new int[g13];
        for (e eVar : eVarArr) {
            int i13 = eVar.f92919a.f92932a;
            iArr[i13] = iArr[i13] + 1;
        }
        for (int i14 = 0; i14 < g13; i14++) {
            eVarArr2[i14] = new e[iArr[i14]];
        }
        Arrays.fill(iArr, 0);
        for (e eVar2 : eVarArr) {
            int i15 = eVar2.f92919a.f92932a;
            e[] eVarArr3 = eVarArr2[i15];
            int i16 = iArr[i15];
            iArr[i15] = i16 + 1;
            eVarArr3[i16] = eVar2;
        }
        this.f92926c = eVarArr2;
        this.f92927d = new int[this.f92928e.g() + 1];
    }

    public final void a(int i13) {
        int[] iArr = this.f92927d;
        if (iArr[i13] != 0) {
            return;
        }
        iArr[i13] = 1;
        for (e eVar : this.f92926c[i13]) {
            a(eVar.f92919a.f92933b);
            int i14 = this.f92925b;
            this.f92925b = i14 - 1;
            this.f92924a[i14] = eVar;
        }
        iArr[i13] = 2;
    }
}
