package eb2;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RowsWithVariableColumnsLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.l2;

/* loaded from: classes2.dex */
public final class j {
    public static void a(l2 l2Var, int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length < 2) {
            throw new IllegalArgumentException("Input parameter firstAndLastPositions must have a valid length of at least 2 in order to hold both the first and last position values!");
        }
        iArr[0] = b(l2Var, iArr2);
        iArr[1] = c(l2Var, iArr2);
    }

    public static int b(l2 l2Var, int[] iArr) {
        if (l2Var instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) l2Var).k1();
        }
        int i13 = -1;
        int i14 = 1;
        if (l2Var instanceof StaggeredGridLayoutManager) {
            int[] h13 = ((StaggeredGridLayoutManager) l2Var).h1(iArr);
            if (h13.length != 0) {
                i13 = h13[0];
                while (i14 < h13.length) {
                    int i15 = h13[i14];
                    if (i15 < i13) {
                        i13 = i15;
                    }
                    i14++;
                }
            }
            return i13;
        }
        if (l2Var instanceof PinterestStaggeredGridLayoutManager) {
            int[] b13 = ((PinterestStaggeredGridLayoutManager) l2Var).b1(iArr);
            if (b13.length != 0) {
                i13 = b13[0];
                while (i14 < b13.length) {
                    int i16 = b13[i14];
                    if (i16 < i13) {
                        i13 = i16;
                    }
                    i14++;
                }
            }
            return i13;
        }
        if (l2Var instanceof RowsWithVariableColumnsLayoutManager) {
            return ((RowsWithVariableColumnsLayoutManager) l2Var).f19279u;
        }
        if (l2Var instanceof GridLayoutManager) {
            return ((GridLayoutManager) l2Var).k1();
        }
        throw new IllegalStateException("LayoutManager is not of type " + LinearLayoutManager.class.getName() + " or " + StaggeredGridLayoutManager.class.getName());
    }

    public static int c(l2 l2Var, int[] iArr) {
        if (l2Var instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) l2Var).l1();
        }
        int i13 = -1;
        int i14 = 1;
        if (l2Var instanceof StaggeredGridLayoutManager) {
            int[] i15 = ((StaggeredGridLayoutManager) l2Var).i1(iArr);
            if (i15.length != 0) {
                i13 = i15[0];
                while (i14 < i15.length) {
                    int i16 = i15[i14];
                    if (i16 > i13) {
                        i13 = i16;
                    }
                    i14++;
                }
            }
            return i13;
        }
        if (l2Var instanceof PinterestStaggeredGridLayoutManager) {
            int[] c13 = ((PinterestStaggeredGridLayoutManager) l2Var).c1(iArr);
            if (c13.length != 0) {
                i13 = c13[0];
                while (i14 < c13.length) {
                    int i17 = c13[i14];
                    if (i17 > i13) {
                        i13 = i17;
                    }
                    i14++;
                }
            }
            return i13;
        }
        if (l2Var instanceof RowsWithVariableColumnsLayoutManager) {
            return ((RowsWithVariableColumnsLayoutManager) l2Var).a1();
        }
        if (l2Var instanceof GridLayoutManager) {
            return ((GridLayoutManager) l2Var).l1();
        }
        throw new IllegalStateException("LayoutManager is not of type " + LinearLayoutManager.class.getName() + " or " + StaggeredGridLayoutManager.class.getName());
    }

    public static int d(l2 l2Var) {
        if (l2Var instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) l2Var).f19286p;
        }
        if (l2Var instanceof PinterestStaggeredGridLayoutManager) {
            return ((PinterestStaggeredGridLayoutManager) l2Var).d1();
        }
        if (l2Var instanceof GridLayoutManager) {
            return ((GridLayoutManager) l2Var).F;
        }
        return 0;
    }
}
