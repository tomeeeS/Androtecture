## Fragment
BaseFragment takes care of layout inflation and provides ``onLayoutInit``, a convenient callback to initialize your layout views in.

Usage of BaseFragment:

```kotlin
class <YourFragment> :
    BaseFragment(R.layout.<your_fragment_layout>)  // extend it, pass your layout
{

    // use this callback to initialize your views. no need for onCreateView, onViewCreated.
    override fun onLayoutInit() {         
        val text1 = requireView().findViewById<TextView>(R.id.text1).apply { 
            text = "foo"
        }
        // or with Android ktx (which allows us to use views from your layout easily and 
        // type-safely without findViewById) :
        // text1.text = "foo"
    } 
    
    ...
}
```
