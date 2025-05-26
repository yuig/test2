package ads_mobile_sdk;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class vb2 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f12431a = new ArrayDeque();

    public final il a(il ilVar, il ilVar2) {
        a(ilVar);
        a(ilVar2);
        il ilVar3 = (il) this.f12431a.pop();
        while (!this.f12431a.isEmpty()) {
            ilVar3 = new xb2((il) this.f12431a.pop(), ilVar3);
        }
        return ilVar3;
    }

    public final void a(il ilVar) {
        if (ilVar.c()) {
            int binarySearch = Arrays.binarySearch(xb2.f13594i, ilVar.size());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int d2 = xb2.d(binarySearch + 1);
            if (!this.f12431a.isEmpty() && ((il) this.f12431a.peek()).size() < d2) {
                int d13 = xb2.d(binarySearch);
                il ilVar2 = (il) this.f12431a.pop();
                while (!this.f12431a.isEmpty() && ((il) this.f12431a.peek()).size() < d13) {
                    ilVar2 = new xb2((il) this.f12431a.pop(), ilVar2);
                }
                xb2 xb2Var = new xb2(ilVar2, ilVar);
                while (!this.f12431a.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(xb2.f13594i, xb2Var.f13595d);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((il) this.f12431a.peek()).size() >= xb2.d(binarySearch2 + 1)) {
                        break;
                    } else {
                        xb2Var = new xb2((il) this.f12431a.pop(), xb2Var);
                    }
                }
                this.f12431a.push(xb2Var);
                return;
            }
            this.f12431a.push(ilVar);
            return;
        }
        if (ilVar instanceof xb2) {
            xb2 xb2Var2 = (xb2) ilVar;
            a(xb2Var2.f13596e);
            a(xb2Var2.f13597f);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(ilVar.getClass())));
    }
}
