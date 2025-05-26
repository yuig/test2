package ja;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f75176a;

    public c0(int i13) {
        if (i13 == 1) {
            this.f75176a = new LinkedHashMap();
            return;
        }
        if (i13 == 3) {
            this.f75176a = new HashMap();
            return;
        }
        if (i13 == 8) {
            this.f75176a = new LinkedHashMap();
            return;
        }
        if (i13 == 5) {
            this.f75176a = new HashMap();
        } else if (i13 != 6) {
            this.f75176a = new LinkedHashMap();
        } else {
            tb0.p pVar = tb0.p.PLATFORM;
            this.f75176a = z0.g(new Pair("de2c37cb4a8d382baac8ea7c9854c669eaa8ea4218ff71892223d96da78a8497", pVar), new Pair("19509bbe35af5b1abc2e68a9ded2c2c11bae056a5da35ae365863ff128c26f7f", pVar), new Pair("e4f6b95101ceb7fc1877fb7965a14a22c392605d1770c1eda12e6152d8bf69ea", pVar), new Pair("af20b7e77d208e88abeb34d34f8d195ea9442e6c8c117acec3ede988ef07199c", pVar), new Pair("a2fe99f86be7fcc40d5af4506911e2c43d7fdbac0e5d98c16e26a7048b5680c4", pVar), new Pair("345fadf971c77d2762d774289d438abd8d52f6aa61e81d86ad7b434d30753fc6", pVar), new Pair("b70ef2b6d6e9c13f9708d80dc18cdc996bc2c0ff168a3123c1c88c0b8940d8fe", pVar), new Pair("175f1e107051d520ac86689368cf11c33d59ec86ee84695eef3aa7d53b2ae1d8", pVar), new Pair("77932b942b774ba92139acd54d7e04e9b2894c2bcab00ea9dfd45ae9517b3c8d", pVar), new Pair("d3395434ddfb0b64e35b88e4a7a495e80c9b9a6595ba528d61b92017774e676b", pVar), new Pair("623aaf40ae4460ffa1ba06da78af55e6c721bac27ca9fe4c12586021ca88782c", pVar), new Pair("ad7a3568ef9e1f2e639f9f28df254df12188e0f174715be849a748998abf0f38", pVar), new Pair("d906109b1e531fb3d06d44268c60c606e679903b613b51431b105c3b701a3e5b", pVar), new Pair("4ff47aa3ee122592e1cf1506206f5dbfa4a76370a2dc676e9cff5f38927a2906", pVar), new Pair("94da83cb6862ef764f3853cb45847f3e93c4f39652d6bfc77e58ad9069f86a30", pVar), new Pair("5ebc2569d98165e99aafdf52d5b160ce683fd3968346369ac5e0cacbb2c53efb", pVar), new Pair("da391b0e4bd1e7b5669eef8bfc19e579e39cb773f59c4cf71381793f9eb2156a", pVar), new Pair("edb670eacb85d0dd1ffa0899eee3ac804c61d0812c3f356f25fb8c2650f59a90", pVar), new Pair("6d0dbfeb9f68c1afeeae2f657710824a214791dda7a3e4e15fc2bb78fbe670c4", pVar), new Pair("704fa8b431b3d0a329b964e3e4ee244b7f49f15e3ce4e7c941abdb65ebb1ba5b", pVar), new Pair("0f8ccfc7ddb3a63fbdbfb9b28991ec790fab95a6d3cc423bac5448dfe1f96a65", pVar), new Pair("4b5af93d38f8b72fb516f6af13a886b017b8ea86e508cbc74d0710548b571326", pVar), new Pair("8c49559a336e403871edf6bd3cad225da28eee096a48ed4a01014c94edbdc70d", pVar), new Pair("ae5fae0b9a72841274f00cabb0e566a8f7668357ceb14ac360613cc0452fa66e", pVar), new Pair("5d7e41ec853b475168be7e80a9fa6e4ee6bb2b26c7a3f169cbdab62ecb43d567", pVar), new Pair("819120c20cd1ab967772eb5d8d4528ee22ab9d13567d902df323b3e3c10633ac", pVar), new Pair("fc8e32d761118567df3f9f29a5487c5d928bccb31cfab8734dffc6a4b8ef91af", pVar), new Pair("6dfe2488eb1756252d3e3203a042cd346b64feff827a31866c04f4d0ecc3cd64", pVar), new Pair("3ea255c38529f9097b7a47ce62020af0739f45b8813e36d9cc6502b0cf1edfd4", pVar), new Pair("658806d00a87ba6d6d72ccd56ee85c1773494bee7433a48fec80ba3a9ce4a35b", pVar), new Pair("598f0288a78e8a8da0ff1b87fd2943feafc2887a128c114fb3804f1426873d25", pVar), new Pair("bf1b47f8fd964e1b2fee6f8de9d21fe9c94fcece6ab6e1d4a12b19fd30932f04", pVar), new Pair("0da638545d706784fb323cee7fd7067c0440051fbb0c47096aa3c01d91d2c212", pVar), new Pair("2dd369871c03a8d13731c6ff04e80f9b7b4b8f8a9d968b5d4e70af9ff9a0121e", pVar), new Pair("3908c3b1d7214eaa9d12c3e5ece3313bb274bfefb86bbef72d8519881097aa07", pVar), new Pair("5faba308a5f3e906c8038a1a7403d8fb07b9cd5cbe6a80275106fcce6e52d40a", pVar), new Pair("0c927f18b9ae6e0d00d56453de135d252b0828a822f85b46be8dbe89c3275ab3", pVar), new Pair("5bf8e2cdd50fe395cccddf3fecb742c125876a8a063093bb423585ecf7a72b0c", pVar), new Pair("22366406106e81ec80f5b1863623cbcc4969f64b634901b7b8c562af3ea40bd0", pVar), new Pair("1c6befe1fb6a9941246df000815992ae0ccaacf6dbc6c0bd460e1759ccfee19c", pVar), new Pair("3a0994661ee16aa2ad351241e00f480184ca50cf702f8b46da2e34cad7f20963", pVar), new Pair("746132a174cad2d8583611380a58b5879547574de95429ab03424cc4405a7e43", pVar), new Pair("11da9fcae262d9137739ec3b9fedd25eaacfeb47e31ff5e2250e4529c257a949", pVar), new Pair("99663caca9073d4c7d4fce1d609601efa474871a6fc3acedaa1b1a9ec4e1f4e1", pVar), new Pair("7e785fa6ada8f1066c56da981075aa1b519f631b76798ad8124a43a155450ba9", pVar), new Pair("1bc29317e659eae5aa39fe178b13679dafc9410567ac2d42218ca7c17c8ebf93", pVar), new Pair("8c28142f194cfa12ef78d3f4f95b71faf598924ae5c7abaf23c972206c20b075", pVar), new Pair("0ec45cb1e9c45056eb7b7dfbd0a3b601fba3523536786dd8966737cf0a5ca424", pVar), new Pair("a1e6d7180279c98fec09e78f6cbd4a37ae39d9a2e2bcdd73f0a43699ba922aac", pVar), new Pair("0c4132492ba3c413609779a3b346a8fe2cbfa5c4c1d753fa6717e63934b32ef3", pVar), new Pair("ef1855241b9315bf4038e65f4712b22410dc3102f7d181c7dde6d01db446b3d6", pVar), new Pair("d6a7d6d1c23a67225a1bdaaa397ee29c0c4d821d739faaf74f3fd594ab7759da", pVar), new Pair("08c796b9cda9ae6549c7fb581d69e9ab41020fe537d0e42c3b0470edfa0c4589", pVar), new Pair("87d6044d1984399c93859c7962302f02dc7f7b21a3c14801fc00fd98c387581a", pVar), new Pair("28b818013e76e42f076ec5e4731041903913590669078d573183c877ce9a8777", pVar), new Pair("4a05363da5af7b6c3af19bd7c089ddfdf1e4708acee50f868092e75e7f1eaa8d", pVar), new Pair("736c65bd729ae09865098479abc9e7d04ede94b2b2cc37b1d9d8893b9133036f", pVar), new Pair("7a4fddfd5e4013a28da45e63eba0a9bd246b32177d5996de822225f01770965c", pVar), new Pair("6f5aaf2cfb3bec0b62190cf5013ba292b72538f431366cb8231ae49f2c7beda9", pVar), new Pair("311440f41a22abeae696d110f1d1ee193507086a8b547149ed0c5ce9be21e65e", pVar), new Pair("aec10f4cb9a94057b563fbc423ff314cfcd90e874987827e5907a676fff98447", pVar), new Pair("868cd788a3cdbc9a742c7b610a7c3d1bd28ec3c18dfe84a457b3c07991046ec9", pVar), new Pair("8118f803ca7535d3593dc9e60d8788b2f0e6be7363cca9ef106ef17465ae46b4", pVar), new Pair("9fd160f7d012dca012fdc30a2ab2658a44192dd27b18f3ee7a25aca0de5136e0", pVar), new Pair("502dd09905538e4d7591a1f270ccead8184954210e1c3cc89f262f45e214a21f", pVar), new Pair("bc12d69da21dcad71476ac162b0c861b30004ac666f4f044943449c46f6e6104", pVar), new Pair("17a2af5ea8ba66d7e2dbea9d43afd8338eb65209c6edfb9b1340726fe9f41937", pVar));
        }
    }

    public static int[] c(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int countTokens = stringTokenizer.countTokens();
            int[] iArr = new int[countTokens];
            for (int i13 = 0; i13 < countTokens; i13++) {
                iArr[i13] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e13) {
            throw new IllegalArgumentException(a.a.k("Unable to parse HTTP flags version string: `", str, "`"), e13);
        }
    }

    public final void a(ka.b... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        for (ka.b bVar : migrations) {
            Integer valueOf = Integer.valueOf(bVar.f78892a);
            Map map = this.f75176a;
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i13 = bVar.f78893b;
            if (treeMap.containsKey(Integer.valueOf(i13))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i13)) + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i13), bVar);
        }
    }

    public final kb.l b() {
        kb.l lVar = new kb.l(this.f75176a);
        bk.f.e0(lVar);
        return lVar;
    }

    public final void d(Object obj, String key) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj == null) {
            obj = null;
        } else {
            Class<?> cls = obj.getClass();
            kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
            rl2.d b13 = l0Var.b(cls);
            if (!Intrinsics.d(b13, l0Var.b(Boolean.TYPE)) && !Intrinsics.d(b13, l0Var.b(Byte.TYPE)) && !Intrinsics.d(b13, l0Var.b(Integer.TYPE)) && !Intrinsics.d(b13, l0Var.b(Long.TYPE)) && !Intrinsics.d(b13, l0Var.b(Float.TYPE)) && !Intrinsics.d(b13, l0Var.b(Double.TYPE)) && !Intrinsics.d(b13, l0Var.b(String.class)) && !Intrinsics.d(b13, l0Var.b(Boolean[].class)) && !Intrinsics.d(b13, l0Var.b(Byte[].class)) && !Intrinsics.d(b13, l0Var.b(Integer[].class)) && !Intrinsics.d(b13, l0Var.b(Long[].class)) && !Intrinsics.d(b13, l0Var.b(Float[].class)) && !Intrinsics.d(b13, l0Var.b(Double[].class)) && !Intrinsics.d(b13, l0Var.b(String[].class))) {
                int i13 = 0;
                if (Intrinsics.d(b13, l0Var.b(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str = kb.m.f79020a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i13 < length) {
                        objArr[i13] = Boolean.valueOf(zArr[i13]);
                        i13++;
                    }
                } else if (Intrinsics.d(b13, l0Var.b(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str2 = kb.m.f79020a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i13 < length2) {
                        objArr[i13] = Byte.valueOf(bArr[i13]);
                        i13++;
                    }
                } else if (Intrinsics.d(b13, l0Var.b(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str3 = kb.m.f79020a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i13 < length3) {
                        objArr[i13] = Integer.valueOf(iArr[i13]);
                        i13++;
                    }
                } else if (Intrinsics.d(b13, l0Var.b(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str4 = kb.m.f79020a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i13 < length4) {
                        objArr[i13] = Long.valueOf(jArr[i13]);
                        i13++;
                    }
                } else if (Intrinsics.d(b13, l0Var.b(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str5 = kb.m.f79020a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i13 < length5) {
                        objArr[i13] = Float.valueOf(fArr[i13]);
                        i13++;
                    }
                } else {
                    if (!Intrinsics.d(b13, l0Var.b(double[].class))) {
                        throw new IllegalArgumentException("Key " + key + " has invalid type " + b13);
                    }
                    double[] dArr = (double[]) obj;
                    String str6 = kb.m.f79020a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i13 < length6) {
                        objArr[i13] = Double.valueOf(dArr[i13]);
                        i13++;
                    }
                }
                obj = objArr;
            }
        }
        this.f75176a.put(key, obj);
    }

    public final void e(HashMap values) {
        Intrinsics.checkNotNullParameter(values, "values");
        for (Map.Entry entry : values.entrySet()) {
            d(entry.getValue(), (String) entry.getKey());
        }
    }

    public final void f(kb.l data) {
        Intrinsics.checkNotNullParameter(data, "data");
        e(data.f79019a);
    }

    public final void g(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f75176a.put(key, Boolean.valueOf(z13));
    }

    public final void h(int i13, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f75176a.put(key, Integer.valueOf(i13));
    }

    public final void i(long j13, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f75176a.put(key, Long.valueOf(j13));
    }

    public final void j(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f75176a.put(key, str);
    }

    public final void k(String key, String[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f75176a.put(key, value);
    }

    public c0(int i13, Map valueMap) {
        if (i13 != 9) {
            Intrinsics.checkNotNullParameter(valueMap, "valueMap");
            this.f75176a = valueMap;
        } else {
            this.f75176a = valueMap;
        }
    }

    public c0(c0 c0Var) {
        this.f75176a = Collections.unmodifiableMap(new HashMap(c0Var.f75176a));
    }

    public c0(tb.c cVar) {
        this.f75176a = new HashMap((Map) cVar.f116960b);
    }
}
