# google-search-automation
Automate Google searches in Java based on predefined keywords. Extract longest &amp; shortest suggestions, organize data into Excel sheets. Handles multiple tabs for data segregation. Includes documentation &amp; code comments for clarity &amp; maintainability.
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><strong><u><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>PROBLEM:&nbsp;</span></u></strong></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>&ldquo;Design and implement a Java program that automates the process of conducting Google searches based on a list of predefined keywords. The program should extract the longest and shortest suggestions provided by Google for each keyword and organize the data into an Excel sheet. Additionally, ensure the program is capable of handling multiple tabs representing different days of the week for data segregation. Please provide the necessary documentation and code comments for clarity and maintainability.&rdquo;</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><strong><u><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>HINTS:</span></u></strong></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>Here is Step by Step Details Process:&nbsp;</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>1. First go to&nbsp;</span><a href="http://www.google.com"><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>www.google.com</span></a><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>2. Write &ldquo;Dhaka&rdquo; in the Search box. What do we see? Multiple options.</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>3. Here longest Option is &ldquo;Dhaka Education Board&rdquo; and the shortest option is &ldquo;Dhaka&rdquo;</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>4. Using the Inspect Option We Can Easily find the desired stuff.&nbsp;</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>5. Suppose we have a given Excel file where there are multiple keywords like this.&nbsp;</span></p>
<table style="width:100.0%;border-collapse:collapse;border:none;">
    <tbody>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:22.1%;border:solid windowtext 1.0pt;border-left:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.54%;border:solid windowtext 1.0pt;border-left:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Longest Option</span></p>
            </td>
            <td style="width:27.76%;border:solid windowtext 1.0pt;border-left:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Shortest Option</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 1</span></p>
            </td>
            <td style="width:22.1%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Dhaka</span></p>
            </td>
            <td style="width:27.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.76%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 2</span></p>
            </td>
            <td style="width: 22.1%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Freedom</span></p>
            </td>
            <td style="width:27.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.76%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 3</span></p>
            </td>
            <td style="width: 22.1%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>License</span></p>
            </td>
            <td style="width:27.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.76%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 4</span></p>
            </td>
            <td style="width: 22.1%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Use</span></p>
            </td>
            <td style="width:27.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.76%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 5</span></p>
            </td>
            <td style="width: 22.1%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Modify</span></p>
            </td>
            <td style="width:27.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.76%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 6</span></p>
            </td>
            <td style="width: 22.1%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Distribute</span></p>
            </td>
            <td style="width:27.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.76%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 7</span></p>
            </td>
            <td style="width: 22.1%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Software</span></p>
            </td>
            <td style="width:27.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.76%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 8</span></p>
            </td>
            <td style="width: 22.1%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Rights</span></p>
            </td>
            <td style="width:27.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.76%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 9</span></p>
            </td>
            <td style="width: 22.1%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Permissions</span></p>
            </td>
            <td style="width:27.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.76%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:22.62%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 10</span></p>
            </td>
            <td style="width: 22.1%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Conditions</span></p>
            </td>
            <td style="width:27.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:27.76%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
    </tbody>
</table>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>6. This Excel Sheet has Multiple Tabs like</span></p>
<table style="width:100.0%;border-collapse:collapse;border:none;">
    <tbody>
        <tr>
            <td style="width:13.38%;border:solid windowtext 1.0pt;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Saturday</span></p>
            </td>
            <td style="width:15.38%;border:solid windowtext 1.0pt;border-left:  none;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Sunday</span></p>
            </td>
            <td style="width:15.38%;border:solid windowtext 1.0pt;border-left:  none;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Monday</span></p>
            </td>
            <td style="width:12.76%;border:solid windowtext 1.0pt;border-left:  none;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Tuesday</span></p>
            </td>
            <td style="width:21.46%;border:solid windowtext 1.0pt;border-left:  none;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Wednesday</span></p>
            </td>
            <td style="width:21.64%;border:solid windowtext 1.0pt;border-left:  none;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Thursday</span></p>
            </td>
        </tr>
    </tbody>
</table>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>7. We have to write a script which will-</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:.5in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>a. First Take Data according to &ldquo;Date&rdquo;&nbsp;</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:.5in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>b. Means if today is Monday it will deal with Monday Data&nbsp;</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>8. When it goes to Monday It will find the Keywords list</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>9. According to the given keyword It will search on Google</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>10. It will find out the longest and shortest option</span></p>
<table style="width:100.0%;border-collapse:collapse;border:none;">
    <tbody>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border:solid windowtext 1.0pt;border-left:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.34%;border:solid windowtext 1.0pt;border-left:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.36%;border:solid windowtext 1.0pt;border-left:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Longest Option</span></p>
            </td>
            <td style="width:20.54%;border:solid windowtext 1.0pt;border-left:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Shortest Option</span></p>
            </td>
            <td style="width:13.32%;border:solid windowtext 1.0pt;border-left:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword1</span></p>
            </td>
            <td style="width:16.34%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Dhaka</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword2</span></p>
            </td>
            <td style="width: 16.34%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Freedom</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword3</span></p>
            </td>
            <td style="width: 16.34%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>License</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword4</span></p>
            </td>
            <td style="width: 16.34%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Use</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword5</span></p>
            </td>
            <td style="width: 16.34%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Modify</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword6</span></p>
            </td>
            <td style="width: 16.34%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Distribute</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword7</span></p>
            </td>
            <td style="width: 16.34%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Software</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 8</span></p>
            </td>
            <td style="width: 16.34%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Rights</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 9</span></p>
            </td>
            <td style="width: 16.34%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Permissions</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Keyword 10</span></p>
            </td>
            <td style="width: 16.34%;border-top: none;border-left: none;border-bottom: 1pt solid windowtext;border-right: 1pt solid windowtext;padding: 0in 5.4pt;vertical-align: top;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Conditions</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td style="width:12.7%;border:solid windowtext 1.0pt;border-top:  none;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Saturday</span></p>
            </td>
            <td style="width:16.74%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Sunday</span></p>
            </td>
            <td style="width:16.34%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Monday</span></p>
            </td>
            <td style="width:20.36%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Tuesday</span></p>
            </td>
            <td style="width:20.54%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Wednesday</span></p>
            </td>
            <td style="width:13.32%;border-top:none;border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;background:#E7E6E6;padding:0in 5.4pt 0in 5.4pt;">
                <p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:center;line-height:normal;'><span style='font-size:16px;font-family:"Times New Roman",serif;color:black;'>Thursday</span></p>
            </td>
        </tr>
    </tbody>
</table>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><span style='font-size:16px;line-height:107%;font-family:"Times New Roman",serif;'>11. The longest and shortest options will be put in the Excel file.</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;'><strong><u><span style='font-size:16px;font-family:"Times New Roman",serif;'>SUGGESTIONS:</span></u></strong></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><strong><span style='font-size:16px;font-family:"Times New Roman",serif;'>Part 1:</span></strong><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;Here are some suggestions to solve the problem and extract data using Java:</span></p>
<p><strong><span style="font-size:16px;">1. Use Selenium WebDriver:</span></strong><span style="line-height:107%;font-size:16px;">&nbsp;Selenium WebDriver is a powerful tool for automating web browser interactions. You can use it to open a browser, navigate to Google&apos;s website, enter search queries, and extract search results.</span></p>
<p><strong><span style="font-size:16px;">2. Apache POI for Excel Manipulation:</span></strong><span style="font-size:16px;">&nbsp;Apache POI is a Java library for reading and writing Microsoft Office files, including Excel spreadsheets. You can use it to create and modify Excel files to store the search results.</span></p>
<p><strong><span style="font-size:16px;">3. Data Structure for Keywords:</span></strong><span style="font-size:16px;">&nbsp;Maintain a data structure (such as a list or array) to store the keywords to be searched. This data structure can be populated from an Excel sheet or defined directly in your Java code.</span></p>
<p><strong><span style="font-size:16px;">4. Looping Through Keywords:</span></strong><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>&nbsp;Iterate through the list of keywords and perform the following actions for each keyword:</span></p>
<ul style="list-style-type: disc;margin-left:0.5in;">
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Navigate to Google&apos;s website.</span></li>
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Enter the keyword in the search box.</span></li>
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Extract the search suggestions provided by Google.</span></li>
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Find the longest and shortest suggestions.</span></li>
</ul>
<p><strong><span style="font-size:16px;">5. Data Handling for Different Days</span></strong><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>: Implement logic to handle different days of the week. You can use Java&apos;s date and time APIs to determine the current day and fetch data accordingly from different tabs in the Excel sheet.</span></p>
<p><strong><span style="font-size:16px;">6. Error Handling:</span></strong><span style="line-height:107%;font-size:16px;">&nbsp;Implement error handling to deal with unexpected situations such as network issues, element not found errors or Excel file write failures.</span></p>
<p><strong><span style="font-size:16px;">7. Documentation and Comments:</span></strong><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>&nbsp;Document your code thoroughly with comments to explain the purpose of each method and the overall logic of the program. This will make your code easier to understand and maintain.</span></p>
<p><strong><span style="font-size:16px;">8. Testing and Debugging:</span></strong><span style="line-height:107%;font-size:16px;">&nbsp;Test your program thoroughly to ensure that it functions as expected in different scenarios. Use debugging techniques to troubleshoot and fix any issues that arise during development.</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><strong><span style='font-size:16px;font-family:"Times New Roman",serif;'>Part -2:</span></strong><span style='font-size:16px;font-family:"Times New Roman",serif;'>&nbsp;By following these suggestions and leveraging the capabilities of Selenium WebDriver and Apache POI, you can develop an effective solution for automating Google searches and extracting data using Java.</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>To address the problem of automating Google searches and extracting data using Java, follow these steps along with the suggested URLs:</span></p>
<p><strong><span style="font-size:16px;">1. Install Java Environment:</span></strong></p>
<ul style="list-style-type: disc;margin-left:0.25in;">
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Download and install the Java Development Kit (JDK) from the official Oracle website:&nbsp;</span><a href="https://www.oracle.com/java/technologies/downloads/"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>Java SE Downloads.</span></a></li>
</ul>
<p><strong><span style="font-size:16px;">2. Install Java IDE:</span></strong></p>
<ul style="list-style-type: disc;margin-left:0.25in;">
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Choose an Integrated Development Environment (IDE) for Java development such as Eclipse or IntelliJ IDEA.</span>
        <ol style="list-style-type: circle;">
            <li><strong><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>Eclipse:</span></strong><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>&nbsp;Download&nbsp;</span><a href="https://www.eclipse.org/downloads/"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>Eclipse IDE</span></a><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>&nbsp;from Eclipse Downloads.</span></li>
            <li><strong><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>IntelliJ IDEA:</span></strong><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>&nbsp;Download&nbsp;</span><a href="https://www.jetbrains.com/idea/download/?section=windows"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>IntelliJ IDEA</span></a><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>&nbsp;from JetBrains.</span></li>
            <li><strong><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>NetBeans:</span></strong><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>&nbsp;Download&nbsp;</span><a href="https://netbeans.apache.org/front/main/download/index.html"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>NetBeans</span></a><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>&nbsp;from NetBeans Downloads.</span></li>
        </ol>
    </li>
</ul>
<p><strong><span style="font-size:16px;">3. Selenium Jar File and Chrome Driver:</span></strong></p>
<ul style="list-style-type: disc;margin-left:0.25in;">
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Download the Selenium WebDriver Java language bindings (JAR file) from the SeleniumHQ website:&nbsp;</span><a href="https://www.selenium.dev/downloads/"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>SeleniumHQ Downloads.</span></a></li>
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Download the ChromeDriver executable that is compatible with your Chrome browser version from the ChromeDriver website:&nbsp;</span><a href="https://chromedriver.chromium.org/downloads"><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>ChromeDriver Downloads.</span></a></li>
</ul>
<p><strong><span style="font-size:16px;">4. Libraries:</span></strong></p>
<ul style="list-style-type: disc;margin-left:0.25in;">
    <li><strong><span style="font-size:16px;">Apache POI Bin:</span></strong><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;Download the Apache POI binary distribution from the Apache POI website:&nbsp;</span><a href="https://poi.apache.org/download.html"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>Apache POI Downloads</span></a><span style='font-family:"Times New Roman",serif;'>.</span></li>
    <li><strong><span style="font-size:16px;">Apache XMLBeans:</span></strong><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;You can find&nbsp;</span><a href="https://xmlbeans.apache.org/download/"><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>XMLBeans</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;in the Apache POI distribution.</span></li>
    <li><strong><span style="font-size:16px;">Apache-log4j:</span></strong><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;Download the Apache Log4j library from the Apache Log4j website:&nbsp;</span><a href="https://logging.apache.org/log4j/2.x/"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>Apache Log4j Downloads</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>.</span></li>
</ul>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Once you have installed the necessary tools and libraries, you can proceed with developing your Java program to automate Google searches and extract data using Selenium WebDriver and Apache POI. Ensure that you configure your Java IDE to include the Selenium and Apache POI libraries in your project&apos;s classpath.</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Use the Selenium WebDriver API to control the browser and interact with web elements on the Google search page. Utilize Apache POI to read and write data to Excel files for storing the search results.</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>By following these steps and using the provided URLs, you can set up your development environment and begin implementing the solution to automate Google searches and data extraction using Java.</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><strong><u><span style='font-size:16px;font-family:"Times New Roman",serif;'>SHORTCUT LEARN:</span></u></strong></p>
<p><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'><strong>1. Connecting to WebDriver:</strong></span></p>
<ul style="list-style-type: disc;margin-left:0.25in;">
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Set up WebDriver to automate browser interactions.</span></li>
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Use Selenium WebDriver to establish a connection with the browser.</span></li>
</ul>
<p><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'><strong>2. Automating Google Search with WebDriver:</strong></span></p>
<ul style="list-style-type: disc;margin-left:0.25in;">
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Utilize WebDriver to navigate to Google&apos;s search page.</span></li>
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Automate search queries using WebDriver&apos;s methods.</span></li>
</ul>
<p><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'><strong>3. Connecting to Excel Sheet:</strong></span></p>
<ul style="list-style-type: disc;margin-left:0.25in;">
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Set up the connection to an Excel sheet using Apache POI.</span></li>
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Initialize and configure Apache POI to read and write data from/to Excel.</span></li>
</ul>
<p><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'><strong>4. Writing Data to Excel Sheet:</strong></span></p>
<ul style="list-style-type: disc;margin-left:0.25in;">
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Use Apache POI to write data from Google search results to the Excel sheet.</span></li>
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Implement methods to input data into specific cells in the Excel sheet.</span></li>
</ul>
<p><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'><strong>5. Reading Data from Excel Sheet:</strong></span></p>
<ul style="list-style-type: disc;margin-left:0.25in;">
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Utilize Apache POI to read data from the Excel sheet.</span></li>
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Implement methods to extract data from specific cells in the Excel sheet.</span></li>
</ul>
<p><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'><strong>6. Implementing All Steps in a For Loop:</strong></span></p>
<ul style="list-style-type: disc;margin-left:0.25in;">
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Integrate all five steps into a for loop to automate the process for multiple search queries.</span></li>
    <li><span style='font-family:"Times New Roman",serif;font-size:16px;line-height:107%;'>Loop through a list of search queries, perform Google searches, extract data, and write it to the Excel sheet iteratively.</span></li>
</ul>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>By mastering these steps, you can efficiently automate Google searches, extract relevant data, and manage it in an Excel sheet using Java with WebDriver and Apache POI.</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Top of Form</span></p>
<p style='margin-top:0in;margin-right:0in;margin-bottom:0in;margin-left:0in;font-size:11.0pt;font-family:"Calibri",sans-serif;text-align:justify;'><span style='font-size:16px;font-family:"Times New Roman",serif;'>Some URLs that will help to solve the problem:</span></p>
<ol style="list-style-type: decimal;">
    <li><a href="https://youtu.be/o2ktVETLww8"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>https://youtu.be/o2ktVETLww8</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://youtu.be/gSprwc8MC_4"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>https://youtu.be/gSprwc8MC_4</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://youtu.be/45ng2smz_w0"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>https://youtu.be/45ng2smz_w0</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://youtu.be/iTsMl7W55QY"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>https://youtu.be/iTsMl7W55QY</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://www.guru99.com/software-testing.html"><span style='font-family:"Times New Roman",serif;'>https://www.guru99.com/software-testing.html</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://www.guru99.com/selenium-tutorial.html"><span style='font-family:"Times New Roman",serif;'>https://www.guru99.com/selenium-tutorial.html</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://www.guru99.com/accessing-forms-in-webdriver.html"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>https://www.guru99.com/accessing-forms-in-webdriver.html</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://www.youtube.com/watch?v=jMP3xOF8OWQ"><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>https://www.youtube.com/watch?v=jMP3xOF8OWQ</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://www.youtube.com/watch?v=lm2n7YOSD3Y"><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>https://www.youtube.com/watch?v=lm2n7YOSD3Y</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://www.youtube.com/watch?v=zylSll8hsPs"><span style='font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:16px;'>https://www.youtube.com/watch?v=zylSll8hsPs</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://dzone.com/articles/selenium-with-java-google-search"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>https://dzone.com/articles/selenium-with-java-google-search</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://www.tutorialspoint.com/how-to-use-selenium-webdriver-to-click-google-search"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>https://www.tutorialspoint.com/how-to-use-selenium-webdriver-to-click-google-search</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
    <li><a href="https://www.techlistic.com/2019/07/automate-google-with-selenium.html"><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>https://www.techlistic.com/2019/07/automate-google-with-selenium.html</span></a><span style='line-height:107%;font-family:"Times New Roman",serif;font-family:"Times New Roman",serif;font-size:12.0pt;'>&nbsp;</span></li>
</ol>
