package androidx.constraintlayout.widget;

import android.util.Log;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f17751a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int[] f17752b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    public int f17753c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int[] f17754d = new int[10];

    /* renamed from: e, reason: collision with root package name */
    public float[] f17755e = new float[10];

    /* renamed from: f, reason: collision with root package name */
    public int f17756f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int[] f17757g = new int[5];

    /* renamed from: h, reason: collision with root package name */
    public String[] f17758h = new String[5];

    /* renamed from: i, reason: collision with root package name */
    public int f17759i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int[] f17760j = new int[4];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f17761k = new boolean[4];

    /* renamed from: l, reason: collision with root package name */
    public int f17762l = 0;

    public final void a(int i13, float f13) {
        int i14 = this.f17756f;
        int[] iArr = this.f17754d;
        if (i14 >= iArr.length) {
            this.f17754d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f17755e;
            this.f17755e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f17754d;
        int i15 = this.f17756f;
        iArr2[i15] = i13;
        float[] fArr2 = this.f17755e;
        this.f17756f = i15 + 1;
        fArr2[i15] = f13;
    }

    public final void b(int i13, int i14) {
        int i15 = this.f17753c;
        int[] iArr = this.f17751a;
        if (i15 >= iArr.length) {
            this.f17751a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f17752b;
            this.f17752b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f17751a;
        int i16 = this.f17753c;
        iArr3[i16] = i13;
        int[] iArr4 = this.f17752b;
        this.f17753c = i16 + 1;
        iArr4[i16] = i14;
    }

    public final void c(int i13, String str) {
        int i14 = this.f17759i;
        int[] iArr = this.f17757g;
        if (i14 >= iArr.length) {
            this.f17757g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f17758h;
            this.f17758h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f17757g;
        int i15 = this.f17759i;
        iArr2[i15] = i13;
        String[] strArr2 = this.f17758h;
        this.f17759i = i15 + 1;
        strArr2[i15] = str;
    }

    public final void d(int i13, boolean z13) {
        int i14 = this.f17762l;
        int[] iArr = this.f17760j;
        if (i14 >= iArr.length) {
            this.f17760j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f17761k;
            this.f17761k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f17760j;
        int i15 = this.f17762l;
        iArr2[i15] = i13;
        boolean[] zArr2 = this.f17761k;
        this.f17762l = i15 + 1;
        zArr2[i15] = z13;
    }

    public final void e(k kVar) {
        for (int i13 = 0; i13 < this.f17753c; i13++) {
            int i14 = this.f17751a[i13];
            int i15 = this.f17752b[i13];
            if (i14 == 6) {
                kVar.f17767e.D = i15;
            } else if (i14 == 7) {
                kVar.f17767e.E = i15;
            } else if (i14 == 8) {
                kVar.f17767e.K = i15;
            } else if (i14 == 27) {
                kVar.f17767e.F = i15;
            } else if (i14 == 28) {
                kVar.f17767e.H = i15;
            } else if (i14 == 41) {
                kVar.f17767e.W = i15;
            } else if (i14 == 42) {
                kVar.f17767e.X = i15;
            } else if (i14 == 61) {
                kVar.f17767e.A = i15;
            } else if (i14 == 62) {
                kVar.f17767e.B = i15;
            } else if (i14 == 72) {
                kVar.f17767e.f17786g0 = i15;
            } else if (i14 == 73) {
                kVar.f17767e.f17788h0 = i15;
            } else if (i14 == 2) {
                kVar.f17767e.f17772J = i15;
            } else if (i14 == 31) {
                kVar.f17767e.L = i15;
            } else if (i14 == 34) {
                kVar.f17767e.I = i15;
            } else if (i14 == 38) {
                kVar.f17763a = i15;
            } else if (i14 == 64) {
                kVar.f17766d.f17817b = i15;
            } else if (i14 == 66) {
                kVar.f17766d.f17821f = i15;
            } else if (i14 == 76) {
                kVar.f17766d.f17820e = i15;
            } else if (i14 == 78) {
                kVar.f17765c.f17831c = i15;
            } else if (i14 == 97) {
                kVar.f17767e.f17804p0 = i15;
            } else if (i14 == 93) {
                kVar.f17767e.M = i15;
            } else if (i14 != 94) {
                switch (i14) {
                    case 11:
                        kVar.f17767e.Q = i15;
                        break;
                    case 12:
                        kVar.f17767e.R = i15;
                        break;
                    case 13:
                        kVar.f17767e.N = i15;
                        break;
                    case 14:
                        kVar.f17767e.P = i15;
                        break;
                    case 15:
                        kVar.f17767e.S = i15;
                        break;
                    case 16:
                        kVar.f17767e.O = i15;
                        break;
                    case 17:
                        kVar.f17767e.f17781e = i15;
                        break;
                    case 18:
                        kVar.f17767e.f17783f = i15;
                        break;
                    default:
                        switch (i14) {
                            case 21:
                                kVar.f17767e.f17779d = i15;
                                break;
                            case 22:
                                kVar.f17765c.f17830b = i15;
                                break;
                            case 23:
                                kVar.f17767e.f17777c = i15;
                                break;
                            case 24:
                                kVar.f17767e.G = i15;
                                break;
                            default:
                                switch (i14) {
                                    case 54:
                                        kVar.f17767e.Y = i15;
                                        break;
                                    case 55:
                                        kVar.f17767e.Z = i15;
                                        break;
                                    case 56:
                                        kVar.f17767e.f17774a0 = i15;
                                        break;
                                    case 57:
                                        kVar.f17767e.f17776b0 = i15;
                                        break;
                                    case 58:
                                        kVar.f17767e.f17778c0 = i15;
                                        break;
                                    case 59:
                                        kVar.f17767e.f17780d0 = i15;
                                        break;
                                    default:
                                        switch (i14) {
                                            case 82:
                                                kVar.f17766d.f17818c = i15;
                                                break;
                                            case 83:
                                                kVar.f17768f.f17843i = i15;
                                                break;
                                            case 84:
                                                kVar.f17766d.f17825j = i15;
                                                break;
                                            default:
                                                switch (i14) {
                                                    case 87:
                                                        break;
                                                    case 88:
                                                        kVar.f17766d.f17827l = i15;
                                                        break;
                                                    case 89:
                                                        kVar.f17766d.f17828m = i15;
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x");
                                                        break;
                                                }
                                        }
                                }
                        }
                }
            } else {
                kVar.f17767e.T = i15;
            }
        }
        for (int i16 = 0; i16 < this.f17756f; i16++) {
            int i17 = this.f17754d[i16];
            float f13 = this.f17755e[i16];
            if (i17 == 19) {
                kVar.f17767e.f17785g = f13;
            } else if (i17 == 20) {
                kVar.f17767e.f17812x = f13;
            } else if (i17 == 37) {
                kVar.f17767e.f17813y = f13;
            } else if (i17 == 60) {
                kVar.f17768f.f17836b = f13;
            } else if (i17 == 63) {
                kVar.f17767e.C = f13;
            } else if (i17 == 79) {
                kVar.f17766d.f17822g = f13;
            } else if (i17 == 85) {
                kVar.f17766d.f17824i = f13;
            } else if (i17 != 87) {
                if (i17 == 39) {
                    kVar.f17767e.V = f13;
                } else if (i17 != 40) {
                    switch (i17) {
                        case 43:
                            kVar.f17765c.f17832d = f13;
                            break;
                        case 44:
                            o oVar = kVar.f17768f;
                            oVar.f17848n = f13;
                            oVar.f17847m = true;
                            break;
                        case 45:
                            kVar.f17768f.f17837c = f13;
                            break;
                        case 46:
                            kVar.f17768f.f17838d = f13;
                            break;
                        case 47:
                            kVar.f17768f.f17839e = f13;
                            break;
                        case 48:
                            kVar.f17768f.f17840f = f13;
                            break;
                        case 49:
                            kVar.f17768f.f17841g = f13;
                            break;
                        case 50:
                            kVar.f17768f.f17842h = f13;
                            break;
                        case 51:
                            kVar.f17768f.f17844j = f13;
                            break;
                        case 52:
                            kVar.f17768f.f17845k = f13;
                            break;
                        case 53:
                            kVar.f17768f.f17846l = f13;
                            break;
                        default:
                            switch (i17) {
                                case 67:
                                    kVar.f17766d.f17823h = f13;
                                    break;
                                case 68:
                                    kVar.f17765c.f17833e = f13;
                                    break;
                                case 69:
                                    kVar.f17767e.f17782e0 = f13;
                                    break;
                                case 70:
                                    kVar.f17767e.f17784f0 = f13;
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                    break;
                            }
                    }
                } else {
                    kVar.f17767e.U = f13;
                }
            }
        }
        for (int i18 = 0; i18 < this.f17759i; i18++) {
            int i19 = this.f17757g[i18];
            String str = this.f17758h[i18];
            if (i19 == 5) {
                kVar.f17767e.f17814z = str;
            } else if (i19 == 65) {
                kVar.f17766d.f17819d = str;
            } else if (i19 == 74) {
                l lVar = kVar.f17767e;
                lVar.f17794k0 = str;
                lVar.f17792j0 = null;
            } else if (i19 == 77) {
                kVar.f17767e.f17796l0 = str;
            } else if (i19 != 87) {
                if (i19 != 90) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    kVar.f17766d.f17826k = str;
                }
            }
        }
        for (int i23 = 0; i23 < this.f17762l; i23++) {
            int i24 = this.f17760j[i23];
            boolean z13 = this.f17761k[i23];
            if (i24 == 44) {
                kVar.f17768f.f17847m = z13;
            } else if (i24 == 75) {
                kVar.f17767e.f17802o0 = z13;
            } else if (i24 != 87) {
                if (i24 == 80) {
                    kVar.f17767e.f17798m0 = z13;
                } else if (i24 != 81) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    kVar.f17767e.f17800n0 = z13;
                }
            }
        }
    }
}
