## Fragment
BaseFragment takes care of 

``Usage of BaseFragment:

class PoiListFragment :
    BaseFragment(R.layout.fragment_poi_list)  // extend it, pass your layout
{

    // use this callback to initialize your views. no need for onCreateView, onViewCreated.
    override fun onLayoutInit() { 
        city_list.adapter = CityListAdapter(this)
        setSavedList()
        swiperefresh.setOnRefreshListener { getPois() }
    } 
    // you can also have kotlin ktx to use views from your layout easily and type-safely without findViewById.
``
